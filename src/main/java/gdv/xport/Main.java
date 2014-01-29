/*
 * Copyright (c) 2009 - 2012 by Oli B.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express orimplied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * (c)reated 17.11.2009 by Oli B. (ob@aosd.de)
 */

package gdv.xport;

import gdv.xport.util.AbstractFormatter;
import gdv.xport.util.HtmlFormatter;
import gdv.xport.util.NullFormatter;
import gdv.xport.util.SatzFactory;
import gdv.xport.util.XmlFormatter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import net.sf.oval.ConstraintViolation;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.output.NullWriter;
import org.apache.log4j.PropertyConfigurator;

/**
 * The Class Main.
 *
 * @author oliver (ob@aosd.de)
 * @since 0.2 (17.11.2009)
 */
public final class Main {

    /**
     * Diese Main-Klasse dient hautpsaechlich zu Demo-Zwecken. Werden keine Optionen angegeben, wird von der
     * Standard-Eingabe (System.in) gelesen und das Ergebnis nach System.out geschrieben. <br/>
     * Mit "-help" bekommt man eine kleine Uebersicht der Optionen.
     *
     * @param args
     *            die verschiendene Argumente (z.B. -import
     *            http://www.gdv-online.de/vuvm/musterdatei_bestand/musterdatei_041222.txt -validate -xml)
     * @throws IOException
     *             falls der Import oder Export schief gegangen ist
     * @throws XMLStreamException
     *             falls bei der XML-Generierung was schief gelaufen ist.
     */
    public static void main(final String[] args) throws IOException, XMLStreamException {
        initLogging();
        OutputStream ostream = System.out;
        Options options = createOptions();
        CommandLineParser parser = new GnuParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            // Option "-help"
            if (cmd.hasOption("help")) {
                printHelp(options);
                System.exit(0);
            }
            // Option "-import"
            Datenpaket datenpaket = new Datenpaket();
            if (cmd.hasOption("import")) {
                String filename = cmd.getOptionValue("import");
                importFrom(filename, datenpaket);
            } else if (cmd.hasOption("java")) {
                datenpaket = SatzFactory.getAllSupportedSaetze();
            } else {
                datenpaket.importFrom(System.in);
            }
            // Option "-xml" bzw. "-html" bzw. "-java"
            AbstractFormatter formatter = new NullFormatter(new NullWriter());
            if (cmd.hasOption("xml")) {
                formatter = new XmlFormatter();
            } else if (cmd.hasOption("html")) {
                formatter = new HtmlFormatter();
            }
            if (cmd.hasOption("export")) {
                File file = new File(cmd.getOptionValue("export"));
                if (cmd.hasOption("java")) {
                    System.err.println("Option -java wird seit 0.9 nicht mehr unterstuetzt.");
                    return;
                }
                if (formatter instanceof NullFormatter) {
                    String suffix = FilenameUtils.getExtension(file.getName());
                    if (suffix.equalsIgnoreCase("xml")) {
                        formatter = new XmlFormatter();
                    } else if (suffix.equalsIgnoreCase("html")) {
                        formatter = new HtmlFormatter();
                    }
                }
                ostream = new FileOutputStream(file);
                formatter.setWriter(ostream);
            }
            formatter.write(datenpaket);
            // Option "-validate"
            if (cmd.hasOption("validate")) {
                printViolations(datenpaket.validate());
            }
        } catch (ParseException e) {
            e.printStackTrace();
            System.err.println("Fehler beim Aufruf von " + Main.class);
            printHelp(options);
            System.exit(1);
        } finally {
            if (ostream != null) {
                ostream.close();
            }
        }
    }

    /**
     * Je nachdem, was als 'filename' uebergeben wird, wird von einer URL oder einer Datei importiert.
     *
     * @param filename
     *            kann sowohl ein Dateiname als auch eine URL sein
     * @param datenpaket
     *            hierein wird importiert
     * @throws IOException
     *             falls was schiefgelaufen ist
     */
    private static void importFrom(final String filename, final Datenpaket datenpaket) throws IOException {
        try {
            URL url = new URL(filename);
            datenpaket.importFrom(url);
        } catch (MalformedURLException e) {
            datenpaket.importFrom(new File(filename));
        }
    }

    /**
     * Creates the options.
     *
     * @return the options
     */
    private static Options createOptions() {
        Options options = new Options();
        options.addOption("import", true, "Import-Datei");
        options.addOption("validate", false, "Validierung der eingelesenen Datensaetze");
        options.addOption("xml", false, "Ausgabe als XML");
        options.addOption("html", false, "Ausgabe als HTML");
        options.addOption("export", true,
                "Export-Datei (bei .xml/.html als Endung ist das Format XML/HTML, ansonsten GDV)");
        options.addOption("help", false, "Kurz-Hilfe");
        return options;
    }

    /**
     * Prints the help.
     *
     * @param options
     *            the options
     */
    private static void printHelp(final Options options) {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp(Main.class.getName(), options);
    }

    /**
     * Prints the violations.
     *
     * @param violations
     *            the violations
     */
    private static void printViolations(final List<ConstraintViolation> violations) {
        if (violations.isEmpty()) {
            System.out.println("keine Datensatz-Verletzung gefunden");
        } else {
            for (ConstraintViolation violation : violations) {
                System.err.println(violation.getValidatedObject() + ": " + violation.getMessage());
            }
        }
    }

    /**
     * Hier sorgen wir dafuer, dass nicht mehr auf der Console, sondern in eine
     * Datei geloggt wird.
     */
    private static void initLogging() {
        URL logURL = Main.class.getResource("main-log4j.properties");
        PropertyConfigurator.configure(logURL);
    }

    /**
     * Damit niemand die Klasse aus Versehen instantiiert, ist der Default-Konstruktor private.
     */
    private Main() {
    }

}
