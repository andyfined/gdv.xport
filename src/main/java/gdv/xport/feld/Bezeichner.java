/*
/*
 * Copyright (c) 2009 - 2013 by Oli B.
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
 * (c)reated 15.10.2009 by Oli B. (ob@aosd.de)
 */

package gdv.xport.feld;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Diese Klasse enthaelt hauptsaechlich String-Konstanten: die Bezeichner der
 * einzelnen Felder. Die Konstanten sind alphabetisch geordnet.
 * <p>
 * Daneben dient diese Klasse auch als String-Erweiterung, um verschiedene
 * Bezeichner besser vergleichen zu koennen. So enthalten manche
 * Bezeichner-Konstanten Leerzeichen, die bei einem Vergleich nicht
 * beruecksichtigt werden sollen.
 * </p>
 * <p>
 * Bitte String-Konstanten alphabetisch ordnen bzw. eintragen! (oboehm,
 * 26-Jan-2013)
 * </p>
 *
 * @author oliver
 * @since 15.10.2009
 */
public final class Bezeichner {

    public static final String ABGANGSDATUM = "Abgangsdatum";
    public static final String ABGANGSGRUND = "Abgangsgrund";
    public static final String ABSCHLAG1_IN_PROZENT = "Abschlag-1 in %";
    public static final String ABSCHLAG1_IN_WAEHRUNGSEINHEITEN = "Abschlag-1";
    public static final String ABSCHLAG2_IN_PROZENT = "Abschlag-2 in %";
    public static final String ABSCHLAG2_IN_WAEHRUNGSEINHEITEN = "Abschlag-2";
    public static final String ABSCHLAG3_IN_PROZENT = "Abschlag-3 in %";
    public static final String ABSCHLAG3_IN_WAEHRUNGSEINHEITEN = "Abschlag-3";
    public static final String ABSCHLAGSBETRAG_IN_WAEHRUNGSEINHEITEN = "Abschlagsbetrag";
    public static final String ABSCHLAG_IN_PROZENT = "Abschlag in %";
    public static final String ABSCHLUSSPROVISION = "Abschlussprovision";
    public static final String ABSENDER = "Absender";
    public static final String ABWEICHENDER_KONTOINHABER1 = "Abweichender Kontoinhaber 1";
    public static final String ABWEICHENDER_KONTOINHABER2 = "Abweichender Kontoinhaber 2";
    public static final String ABWEICHENDE_VU_NR = "Abweichende VU-Nr.";
    public static final String ADRESSAT = "Adressat";
    public static final String ADRESSKENNZEICHEN = "Adresskennzeichen";
    public static final String AENDERUNGSDATUM = "Aenderungsdatum";
    public static final String AENDERUNGSGRUND = "Aenderungsgrund";
    public static final String AFB = "A,F,B";
    public static final String AKTENZEICHEN_SICHERUNGSGLAEUBIGER = "Aktenzeichen des Sicherungsglaeubigers";
    public static final String AKTUELLE_BEITRAGSDEPOTSUMME_IN_WAEHRUNGSEINHEITEN = "aktuelle Beitragsdepotsumme";
    public static final String ALLGEMEINE_VERSICHERUNGSBEDINGUNGEN = "Allgemeine Versicherungsbedingungen";
    public static final String AMTL_KENNZEICHEN = "Amtl. Kennzeichen";
    public static final String ANREDESCHLUESSEL = "Anredeschluessel";
    public static final String ANTEIL_IN_PROZENT = "Anteil in %";
    public static final String ANTRAGSDATUM = "Antragsdatum";
    public static final String ANTRAGSEINGANGSDATUM = "Antragseingangsdatum";
    public static final String ANZAHL_DER_VORBESITZER = "Anzahl der Vorbesitzer";
    public static final String ANZAHL_SAETZE = "Anzahl der Saetze";
    public static final String ANZAHL_VP_PRO_PERSONENGRUPPE = "Anzahl der VP pro Personengruppe";
    public static final String ANZAHL_WOHNEINHEITEN = "Anzahl Wohnheiten";
    public static final String ARB = "ARB (Allgemeine Bedingungen fuer die Rechtschutzvers.)";
    public static final String ART_DER_HEILKOSTEN = "Art der Heilkosten";
    public static final String ART_DER_STEUERLICHEN_FOERDERUNG = "Art der steuerlichen Foerderung";
    public static final String ART_DER_ZULASSUNG_BEIM_VORBESITZER = "Art der Zulassung beim Vorbesitzer";
    public static final String ART_DES_ABSENDERS = "Art des Absenders";
    public static final String ART_DES_ADRESSATEN = "Art des Adressaten";
    public static final String ART_DES_AMTLICHEN_KENNZEICHENS = "Art des amtlichen Kennzeichens";
    public static final String ART_DES_DRITTRECHTS = "Art des Drittrechts";
    public static final String AUFBAUART = "Aufbauart";
    public static final String AUFSICHTSFREIER_VERTRAG = "Aufsichtsfreier Vertrag";
    public static final String AUFTEILUNG_VERSICHERUNGSSTEUER = "Aufteilung Versicherungsteuer gemaess EU-Richtlinien";
    public static final String AUFTRAGSNR_VERMITTLER = "Auftrags-Nr. des Vermittlers";
    public static final String AUSSCHLUSS = "Ausschluss";
    public static final String AUSSCHLUSSDATUM_VP = "Ausschlussdatum VP / Personengruppe";
    public static final String BAUJAHR = "Baujahr";
    public static final String BAUSTEIN_GESAMTBEITRAG_1_IN_WAEHRUNGSEINHEITEN = "Baustein-Gesamtbeitrag 1";
    public static final String BAUSTEIN_GESAMTBEITRAG_2_IN_WAEHRUNGSEINHEITEN = "Baustein-Gesamtbeitrag 2";
    public static final String BEGINN = "Beginn";
    public static final String BEGINN_TAGEGELD1_AB_TAG = "Beginn Tagegeld 1 ab Tag";
    public static final String BEGINN_TAGEGELD2_AB_TAG = "Beginn Tagegeld 2 ab Tag";
    public static final String BEGINN_VERSICHERUNGSSCHUTZ = "Beginn Versicherungsschutz";
    public static final String BEITRAGSANGLEICHUNGSKLAUSEL = "Beitragsangleichungsklausel";
    public static final String BEITRAGSDEPOT = "Beitragsdepot";
    public static final String BEITRAGSKLASSE = "Beitragsklasse";
    public static final String BEITRAGSREGULIERUNG = "Beitragsregulierung";
    public static final String BEITRAGSRUECKGEWAEHR = "Beitragsrueckgewaehr";
    public static final String BEITRAGSUMSTELLUNGSDATUM = "Beitragsumstellungsdatum";
    public static final String BEITRAGSUMSTELLUNGSGRUND = "Beitragsumstellungsgrund";
    public static final String BEITRAG_BERGUNGSKOSTEN_IN_WAEHRUNGSEINHEITEN = "Beitrag Bergungskosten";
    public static final String BEITRAG_FESTE_RENTE_IN_WAEHRUNGSEINHEITEN = "Beitrag Feste Rente";
    public static final String BEITRAG_GENESUNGSGELD_IN_WAEHRUNGSEINHEITEN = "Beitrag Genesungsgeld";
    public static final String BEITRAG_HEILKOSTEN_IN_WAEHRUNGSEINHEITEN = "Beitrag Heilkosten";
    public static final String BEITRAG_INVALIDITAET_IN_WAEHRUNGSEINHEITEN = "Beitrag Invaliditaet";
    public static final String BEITRAG_IN_WAEHRUNGSEINHEITEN = "Beitrag";
    public static final String BEITRAG_KOSMETISCHE_OPERATION_IN_WAEHRUNGSEINHEITEN = "Beitrag Kosmetische Operation";
    public static final String BEITRAG_KRANKENHAUSTAGEGELD_IN_WAEHRUNGSEINHEITEN = "Beitrag Krankenhaustagegeld";
    public static final String BEITRAG_KURKOSTEN_IN_WAEHRUNGSEINHEITEN = "Beitrag Kurkosten";
    public static final String BEITRAG_PRO_VP_IN_WAEHRUNGSEINHEITEN = "Beitrag pro VP oder pro Personengruppe";
    public static final String BEITRAG_SERVICELEISTUNGEN_IN_WAEHRUNGSEINHEITEN = "Beitrag Serviceleistungen";
    public static final String BEITRAG_TAGEGELD1_IN_WAEHRUNGSEINHEITEN = "Beitrag Tagegeld 1";
    public static final String BEITRAG_TAGEGELD2_IN_WAEHRUNGSEINHEITEN = "Beitrag Tagegeld 2";
    public static final String BEITRAG_TOD_IN_WAEHRUNGSEINHEITEN = "Beitrag Tod";
    public static final String BEITRAG_UEBERGANGSENTSCHAEDIGUNG_IN_WAEHRUNGSEINHEITEN = "Beitrag Uebergangsentschaedigung";
    public static final String BERGUNGSKOSTEN = "Bergungskosten";
    public static final String BERGUNGSKOSTEN_BEITRAGSSATZ = "Bergungskosten Beitragssatz";
    public static final String BERUFSGRUPPENEINTEILUNG = "Berufsgruppeneinteilung im Industrie-Straf-RS";
    public static final String BERUFSSCHLUESSEL = "Berufsschluessel";
    public static final String BERUF_TEXT = "Beruf-Text";
    public static final String BESONDERER_VERWENDUNGSZWECK = "besonderer Verwendungszweck";
    public static final String BESONDERE_VEREINBARUNG_ZUM_FLUGGASTRISIKO = "Besondere Vereinbarung zum Fluggastrisiko";
    public static final String BESTANDSFUEHRENDE_GESCHAEFTSSTELLE = "Bestandsfuehrende Geschaeftsstelle";
    public static final String BESTANDSPFLEGEPROVISION = "Bestandspflegeprovision";
    public static final String BETRIEBLICHE_ALTERSVORSORGE = "Betriebliche Altersvorsorge";
    public static final String BEZEICHNUNG_PERSONENGRUPPE = "Bezeichnung Personengruppe";
    public static final String BEZUGSBERECHTIGT_IM_LEISTUNGSFALL = "Bezugsberechtigt im Leistungsfall";
    public static final String BEZUGSRECHTANTEIL_IM_LEISTUNGSFALL = "Bezugsrechtanteil im Leistungsfall";
    public static final String BIC1 = "BIC 1";
    public static final String BIC2 = "BIC 2";
    public static final String BILANZMONAT_ARBEITGEBER = "Bilanzmonat Arbeitgeber";
    public static final String BLZ1 = "Bankleitzahl 1";
    public static final String BLZ2 = "Bankleitzahl 2";
    public static final String BUENDELUNGSKENNZEICHEN = "Buendelungskennzeichen";
    public static final String DATUM_DER_BEZUGSFERTIGKEIT = "Datum der Bezugsfertigkeit";
    public static final String DATUM_LETZTE_BEITRAGSANGLEICHUNG = "Datum der letzten Beitragsangleichung";
    public static final String DECKUNGSSUMME_IN_TSD_WAEHRUNGSEINHEITEN = "Deckungssumme in Tausend Waehrungseinheiten";
    public static final String DECKUNGSSUMME_IN_WAEHRUNGSEINHEITEN = "Deckungssumme";
    public static final String DECKUNGSUMFANG = "Deckungsumfang";
    public static final String DIENSTEINTRITTSDATUM = "Diensteintrittsdatum";
    public static final String DRUCKAUFBEREITETE_VERSICHERUNGSSCHEINNUMMER = "Druckaufbereitete Versicherungsscheinnummer";
    public static final String DURCHFUEHRUNGSWEG = "Durchfuehrungsweg";
    public static final String DYNAMIK = "Dynamik";
    public static final String DYNAMIK_IN_PROZENT = "Dynamik in %";
    public static final String EIGENTUMSVERHAELTNIS_FAHRZEUG = "Eigentumsverhaeltnis (Fahrzeug)";
    public static final String EINSCHLUSSDATUM_VP = "Einschlussdatum VP / Personengruppe";
    public static final String EINZAHLUNG_AUSSCHUETTUNG = "Einzahlung / Ausschuettung";
    public static final String ENDEDATUM_DES_VERSICHERUNGSSCHUTZES_BEI_ROTEN_KENNZEICHEN = "Endedatum des Versicherungsschutzes bei roten Kennzeichen";
    public static final String ERHOEHUNGSART_DYNAMIK = "Erhoehungsart Dynamik";
    public static final String ERSTELLUNGSDATUM_ZEITRAUM_BIS = "Erstellungs-Datum-Zeitraum bis";
    public static final String ERSTELLUNGSDATUM_ZEITRAUM_VOM = "Erstellungs-Datum-Zeitraum vom";
    public static final String ERSTE_ZULASSUNG_AUF_DEN_VN = "Erste Zulassung auf den VN";
    public static final String ERSTZULASSUNG = "Erstzulassung";
    public static final String ERWEITERUNGSSATZ_VORHANDEN = "Erweiterungssatz vorhanden";
    public static final String EVB_NUMMER = "eVB-Nummer";
    public static final String FAHRZEUGART = "Fahrzeugart";
    public static final String FAHRZEUGIDENTIFIZIERUNGSNUMMER = "Fahrzeugidentifizierungsnummer";
    public static final String FAMILIENSTAND = "Familienstand";
    public static final String FESTE_RENTE = "Feste Rente";
    public static final String FESTE_RENTE_BEITRAGSSATZ = "Feste Rente Beitragssatz";
    public static final String FINANZIERUNGSART = "Finanzierungsart";
    public static final String FINANZIERUNG_ZUSAGE = "Finanzierung der Zusage";
    public static final String FLOTTENKENNZEICHEN = "Flottenkennzeichen";
    public static final String FLOTTENRABATT_IN_PROZENT = "Flottenrabatt in %";
    public static final String FOLGENUMMER = "Folgenummer";
    public static final String FOLGEPROVISION = "Folgeprovision";
    public static final String FREMDER_GRUND_UND_BODEN = "fremder Grund und Boden";
    public static final String FREMDNUTZUNG = "Fremdnutzung";
    public static final String FREI_VEREINBARTE_SELBSTBETEILIGUNG_IN_WAEHRUNGSEINHEITEN_FUER_KH = "Frei vereinbarte Selbstbeteiligung fuer KH";
    public static final String FREI_VEREINBARTE_SELBSTBETEILIGUNG_IN_WAEHRUNGSEINHEITEN_FUER_TEILKASKO = "Frei vereinbarte Selbstbeteiligung fuer Teilkasko";
    public static final String FREI_VEREINBARTE_SELBSTBETEILIGUNG_IN_WAEHRUNGSEINHEITEN_FUER_TEILKASKO_IM_RAHMEN_DER_VOLLKASKO = "Frei vereinbarte Selbstbeteiligung fuer Teilkasko im Rahmen der Vollkasko";
    public static final String FREI_VEREINBARTE_SELBSTBETEILIGUNG_IN_WAEHRUNGSEINHEITEN_FUER_VOLLKASKO = "Frei vereinbarte Selbstbeteiligung fuer Vollkasko";
    public static final String GAP_DECKUNG = "GAP-Deckung";
    public static final String GARAGE = "Garage";
    public static final String GEBURTSDATUM = "Geburtsdatum";
    public static final String GEBURTSLAND = "Geburtsland";
    public static final String GEBURTSNAME = "Geburtsname";
    public static final String GEBURTSORT = "Geburtsort";
    public static final String GEFAHRENGRUPPE = "Gefahrengruppe";
    public static final String GEFAHRGUT = "Gefahrgut";
    public static final String GELTUNGSBEREICH = "Geltungsbereich";
    public static final String GELTUNGSBEREICHEINSCHRAENKUNG = "Geltungsbereicheinschraenkung";
    public static final String GENESUNGSGELD = "Genesungsgeld";
    public static final String GENESUNGSGELD_BEITRAGSSATZ = "Genesungsgeld Beitragssatz";
    public static final String GESAMTBEITRAG = "Gesamtbeitrag";
    public static final String GESAMTBEITRAG_BRUTTO = "Gesamtbeitrag-Brutto(Inkasso)";
    public static final String GESAMTBEITRAG_BRUTTO_IN_WAEHRUNGSEINHEITEN = "Gesamtbeitrag (Brutto)";
    public static final String GESAMTBEITRAG_IN_WAEHRUNGSEINHEITEN = "Gesamtbeitrag";
    public static final String GESAMTBEITRAG_NETTO_IN_WAEHRUNGSEINHEITEN = "Gesamtbeitrag (Netto)";
    public static final String GESAMTMASSE = "Gesamtmasse";
    public static final String GESAMTPROVISIONSBETRAG = "Gesamtprovisions-Betrag";
    public static final String GESCHLECHT = "Geschlecht";
    public static final String GROSSRISIKEN = "Aufsichtsfreier Versicherungsnehmer (Grossrisiken)";
    public static final String GRUPPENART = "Gruppenart";
    public static final String GUELTIGE_AKB = "Gueltige AKB";
    public static final String GUELTIGKEITSDAUER_IN_TAGEN_BEI_KURZZEITKENNZEICHEN = "Gueltigkeitsdauer in Tagen bei Kurzzeitkennzeichen";
    public static final String HAUPTFAELLIGKEIT = "Hauptfaelligkeit";
    public static final String HEILKOSTEN = "Heilkosten";
    public static final String HEILKOSTEN_BEITRAGSSATZ = "Heilkosten Beitragssatz";
    public static final String HERSTELLERNAME = "Herstellername";
    public static final String HERSTELLER_SCHLUESSEL_NR = "Hersteller-Schluessel-Nr.";
    public static final String IBAN1 = "IBAN 1";
    public static final String IBAN2 = "IBAN 2";
    public static final String INKASSOART = "Inkassoart";
    public static final String INVALIDITAET = "Invaliditaet";
    public static final String INVALIDITAET_BEITRAGSSATZ = "Invaliditaet Beitragssatz";
    public static final String JAEHRLICHE_FAHRLEISTUNG = "Jaehrliche Fahrleistung";
    public static final String KAPITALERTRAGSTEUERPFLICHT = "Kapitalertragsteuerpflicht";
    public static final String KASKO_BEGINNJAHR = "Kasko-Beginnjahr";
    public static final String KAUFPREIS = "Kaufpreis";
    public static final String KENNUNG_FUER_ABS_RABATT = "Kennung fuer ABS-Rabatt";
    public static final String KENNUNG_GLIEDERTAXE = "Kennung Gliedertaxe";
    public static final String KENNUNG_PROGRESSIVE_INVALIDITAET = "Kennung progressive Invaliditaet";
    public static final String KENNUNG_UEBERGANGSENTSCHAEDIGUNG = "Kennung Uebergangsentschaedigung";
    public static final String KENNZEICHEN_ABWEICHENDE_ABSCHLUSSPROVISION = "Kennzeichen fuer abweichende Abschlussprovision";
    public static final String KENNZEICHEN_ABWEICHENDE_BESTANDSPFLEGEPROVISION = "Kennzeichen fuer abweichende Bestandspflegeprovision";
    public static final String KENNZEICHEN_ABWEICHENDE_FOLGEPROVISION = "Kennzeichen fuer abweichende Folgeprovision";
    public static final String KENNZEICHEN_ABWEICHENDE_VU_NR = "Kennzeichen zur Erlaeuterung der abweichenden VU-Nr.";
    public static final String KENNZEICHEN_FUER_ABWEICHENDE_PROVISION = "Kennzeichen fuer abweichende Provision";
    public static final String KENNZEICHEN_VERS_STEUER_FREI = "Kennzeichen Vers.-Steuer frei";
    public static final String KENNZEICHEN_VERTRAGSENTSTEHUNG = "Kennzeichen Vertragsentstehung";
    public static final String KFT_ABSCHLAEGE_IN_PROZENT = "KFT-Abschlaege in %";
    public static final String KFT_ABSCHLAEGE_IN_WAEHRUNGSEINHEITEN = "KFT-Abschlaege";
    public static final String KFT_AENDERUNGSDATUM = "KFT-aenderungsdatum";
    public static final String KFT_AUSSCHLUSS = "KFT-Ausschluss";
    public static final String KFT_BEGINN = "KFT-Beginn";
    public static final String KFT_BEITRAG_IN_WAEHRUNGSEINHEITEN = "KFT-Beitrag";
    public static final String KFT_DECKUNGSART = "KFT-Deckungsart";
    public static final String KFT_TARIFGRUPPE = "KFT-Tarifgruppe";
    public static final String KFT_ZUSCHLAEGE_IN_PROZENT = "KFT-Zuschlaege in %";
    public static final String KFT_ZUSCHLAEGE_IN_WAEHRUNGSEINHEITEN = "KFT-Zuschlaege";
    public static final String KFV_ABSCHLAEGE_IN_PROZENT = "KFV-Abschlaege in %";
    public static final String KFV_ABSCHLAEGE_IN_WAEHRUNGSEINHEITEN = "KFV-Abschlaege";
    public static final String KFV_AENDERUNGSDATUM = "KFV-aenderungsdatum";
    public static final String KFV_AUSSCHLUSS = "KFV-Ausschluss";
    public static final String KFV_BEGINN = "KFV-Beginn";
    public static final String KFV_BEITRAGSSATZ = "KFV-Beitragssatz";
    public static final String KFV_BEITRAG_IN_WAEHRUNGSEINHEITEN = "KFV-Beitrag";
    public static final String KFV_DECKUNGSART = "KFV-Deckungsart";
    public static final String KFV_RGJ = "KFV-RGJ";
    public static final String KFV_SCHAEDEN_AUS_RUECKSTUFUNG = "KFV-Schaeden aus Rueckstufung";
    public static final String KFV_SFS_KLASSE = "KFV-SF/S-Klasse";
    public static final String KFV_TARIFGRUPPE = "KFV-Tarifgruppe";
    public static final String KFV_ZUSCHLAEGE_IN_PROZENT = "KFV-Zuschlaege in %";
    public static final String KFV_ZUSCHLAEGE_IN_WAEHRUNGSEINHEITEN = "KFV-Zuschlaege";
    public static final String KH_ABSCHLAEGE_IN_PROZENT = "KH-Abschlaege in %";
    public static final String KH_ABSCHLAEGE_IN_WAEHRUNGSEINHEITEN = "KH-Abschlaege";
    public static final String KH_AENDERUNGSDATUM = "KH-aenderungsdatum";
    public static final String KH_AUSSCHLUSS = "KH-Ausschluss";
    public static final String KH_BEGINN = "KH-Beginn";
    public static final String KH_BEITRAGSSAETZE = "KH-Beitragssaetze";
    public static final String KH_BEITRAG_IN_WAEHRUNGSEINHEITEN = "KH-Beitrag";
    public static final String KH_DECKUNGSART = "KH Deckungsart";
    public static final String KH_DECKUNGSSUMMEN = "KH-Deckungssummen";
    public static final String KH_DECKUNGSSUMMEN_IN_WAEHRUNGSEINHEITEN = "KH-Deckungssummen";
    public static final String KH_DECKUNGSSUMMEN_IN_WAEHRUNGSEINHEITEN_TEIL1 = "KH-Deckungssummen Teil 1";
    public static final String KH_DECKUNGSSUMMEN_IN_WAEHRUNGSEINHEITEN_TEIL2 = "KH-Deckungssummen Teil 2";
    public static final String KH_DECKUNGSSUMMEN_IN_WAEHRUNGSEINHEITEN_TEIL3 = "KH-Deckungssummen Teil 3";
    public static final String KH_DECKUNGSSUMMEN_PERSONENSCHAEDEN = "KH-Deckungssummen Personenschaeden";
    public static final String KH_DECKUNGSSUMMEN_SACHSCHAEDEN = "KH-Deckungssummen Sachschaeden";
    public static final String KH_DECKUNGSSUMMEN_VERMOEGENSCHAEDEN = "KH-Deckungssummen Vermoegensschaeden";
    public static final String KH_RGJ = "KH-RGJ";
    public static final String KH_SCHAEDEN_AUS_RUECKSTUFUNG = "KH-Schaeden aus Rueckstufung";
    public static final String KH_SF_S_KLASSE = "KH-SF/S-Klasse";
    public static final String KH_TARIFGRUPPE = "KH-Tarifgruppe";
    public static final String KH_ZUSCHLAEGE_IN_PROZENT = "KH-Zuschlaege in %";
    public static final String KH_ZUSCHLAEGE_IN_WAEHRUNGSEINHEITEN = "KH-Zuschlaege";
    public static final String KLARTEXT_SICHERUNGSEINRICHTUNG = "Klartext Sicherungseinrichtung";
    public static final String KOLLEKTIV_NR = "Kollektiv-Nr.";
    public static final String KOMMUNIKATIONSNR1 = "Kommunikationsnummer 1";
    public static final String KOMMUNIKATIONSNR2 = "Kommunikationsnummer 2";
    public static final String KOMMUNIKATIONSNR3 = "Kommunikationsnummer 3";
    public static final String KOMMUNIKATIONSNR4 = "Kommunikationsnummer 4";
    public static final String KOMMUNIKATIONSNR5 = "Kommunikationsnummer 5";
    public static final String KOMMUNIKATIONSNR6 = "Kommunikationsnummer 6";
    public static final String KOMMUNIKATIONSNR7 = "Kommunikationsnummer 7";
    public static final String KOMMUNIKATIONSTYP1 = "Kommunikationstyp 1";
    public static final String KOMMUNIKATIONSTYP2 = "Kommunikationstyp 2";
    public static final String KOMMUNIKATIONSTYP3 = "Kommunikationstyp 3";
    public static final String KOMMUNIKATIONSTYP4 = "Kommunikationstyp 4";
    public static final String KOMMUNIKATIONSTYP5 = "Kommunikationstyp 5";
    public static final String KOMMUNIKATIONSTYP6 = "Kommunikationstyp 6";
    public static final String KOMMUNIKATIONSTYP7 = "Kommunikationstyp 7";
    public static final String KONTONR1 = "Kontonummer 1";
    public static final String KONTONR2 = "Kontonummer 2";
    public static final String KOSMETISCHE_OPERATIONEN = "Kosmetische Operationen";
    public static final String KOSMETISCHE_OPERATIONEN_BEITRAGSSATZ = "Kosmetische Operationen Beitragssatz";
    public static final String KRANKENHAUSTAGEGELD = "Krankenhaustagegeld";
    public static final String KRANKENHAUSTAGEGELD_BEITRAGSSATZ = "Krankenhaustagegeld Beitragssatz";
    public static final String KREISGEMEINDESCHLUESSEL = "Kreisgemeindeschluessel";
    public static final String KREISGEMEINDESCHLUESSEL_ZUSATZINFORMATION = "Kreisgemeindeschluessel Zusatzinformation";
    public static final String KUENDIGUNGSKLAUSEL = "Kuendigungsklausel";
    public static final String KUENDIGUNGSKLAUSEL_VP = "Kuendigungsklausel VP / Personengruppe gestrichen";
    public static final String KUNDENGRUPPE = "Kundengruppe";
    public static final String KUNDENNR_VERMITTLER = "Personen-/Kundennummer des Vermittlers";
    public static final String KUNDENNR_VERSICHERER = "Personen-/Kundennummer des Versicherers";
    public static final String KURKOSTEN = "Kurkosten";
    public static final String KURKOSTEN_BEITRAGSSATZ = "Kurkosten Beitragssatz";
    public static final String LAENDERKENNZEICHEN = "Laenderkennzeichen";
    public static final String LAND_DES_AMTL_KENNZEICHENS = "Land des amtl. Kennzeichens";
    public static final String LAUFZEITRABATT_IN_PROZENT = "Laufzeitrabatt in %";
    public static final String LEERSTELLEN = "Leerstellen";
    public static final String LEERSTELLEN1 = "Leerstellen";
    public static final String LEERSTELLEN2 = "Leerstellen";
    public static final String LEERSTELLEN3 = "Leerstellen";
    public static final String LEERSTELLEN4 = "Leerstellen";
    public static final String LEERSTELLEN5 = "Leerstellen";
    public static final String LETZTE_ERHOEHUNG = "letzte Erhoehung";
    public static final String LFD_NUMMER = "Lfd. Nummer";
    public static final String LFD_NUMMER1 = "Lfd. Nummer";
    public static final String LFD_NUMMER2 = "Lfd. Nummer";
    public static final String LFD_NUMMER_SATZART = "Lfd. Nummer der Satzart";
    public static final String LFD_NUMMER_VP = "Lfd. Nummer der versicherten Person (VP)";
    public static final String LFD_NUMMER_VP_PERSONENGRUPPE = "Lfd. Nummer der versicherten Person (VP) / Personengruppe";
    public static final String LFD_NUMMER_VP_PERSONENGRUPPE1 = "Lfd. Nummer der versicherten Person (VP) / Personengruppe";
    public static final String LFD_NUMMER_VP_PERSONENGRUPPE2 = "Lfd. Nummer der versicherten Person (VP) / Personengruppe";
    public static final String LFD_NUMMER_VP_PERSONENGRUPPE3 = "Lfd. Nummer der versicherten Person (VP) / Personengruppe";
    public static final String LFD_NUMMER_VP_PERSONENGRUPPE4 = "Lfd. Nummer der versicherten Person (VP) / Personengruppe";
    public static final String LFD_NUMMER_VP_PERSONENGRUPPE9 = "Lfd. Nummer der versicherten Person (VP) / Personengruppe";
    public static final String LFD_PERSONENNR_GEVO = "Lfd. Personennummer im GeVo";
    public static final String LFD_PERSONENNUMMER_DES_SICHERUNGSGLAEUBIGERS = "Lfd. Personennummer des Sicherungsglaeubigers";
    public static final String MEHRLEISTUNGSKLAUSEL = "Mehrleistungsklausel";
    public static final String MEHRWERTGRUND = "Mehrwertgrund";
    public static final String MEHRWERT_IN_WAEHRUNGSEINHEITEN = "Mehrwert";
    public static final String MEHRZWECKFELD = "Mehrzweckfeld";
    public static final String MITVERSICHERTE_PERSON_FAMILIENNAME = "Mitversicherte Person Familienname";
    public static final String MITVERSICHERTE_PERSON_VORNAME = "Mitversicherte Person Vorname";
    public static final String MODELLNAME = "Modellname";
    public static final String NAECHSTE_ERHOEHUNG = "naechste Erhoehung";
    public static final String NAME1 = "Name1";
    public static final String NAME2 = "Name2";
    public static final String NAME3 = "Name3";
    public static final String NAME_KREDITINSTITUT1 = "Name des Kreditinstituts 1";
    public static final String NAME_KREDITINSTITUT2 = "Name des Kreditinstituts 2";
    public static final String NAME_MITVERSICHERTES_KIND = "Name des mitversicherten Kinds";
    public static final String NAME_VP = "Name der VP";
    public static final String NEUPREIS_IN_WAEHRUNGSEINHEITEN = "Neupreis in Waehrungseinheiten";
    public static final String NUTZUNGSART = "Nutzungsart";
    public static final String ORDNUNGSBEGRIFF = "Ordnungsbegriff";
    public static final String ORT = "Ort";
    public static final String PASSIVES_KRIEGSRISIKO = "passives Kriegsrisiko";
    public static final String PERSONENNUMMER_LFD_NUMMER = "Personennummer / lfd. Nummer";
    public static final String PERSONEN_KUNDENNUMMER_DES_VERSICHERERS = "Personen-/Kundennummer des Versicherers";
    public static final String POLICIERUNGSDATUM = "Policierungsdatum";
    public static final String POSTALISCHES_KENNZEICHEN = "postalisches Kennzeichen";
    public static final String POSTFACH = "postfach";
    public static final String POSTLEITZAHL = "Postleitzahl";
    public static final String PRODUKTBESCHREIBUNG = "Produktbeschreibung";
    public static final String PRODUKTFORM = "Produktform";
    public static final String PRODUKTFORM_GUELTIG_AB = "Produktform gueltig ab";
    public static final String PRODUKTKENNUNG = "Produktkennung";
    public static final String PRODUKTNAME = "Produktname";
    public static final String PRODUKTSPEZIFISCHE_ANTRAGSDATEN = "Produktspezifische Antragsdaten";
    public static final String PRODUKTSPEZIFISCHE_STAMMDATEN = "Produktspezifische Stammdaten";
    public static final String PROVISION = "Provision";
    public static final String PROZENTSATZ_PROGRESSIVE_INVALIDITAET = "Prozentsatz progressive Invaliditaet";
    public static final String RATENZAHLUNGSZUSCHLAG_IN_PROZENT = "Ratenzahlungszuschlag in %";
    public static final String RECHTSFORM = "Rechtsform";
    public static final String REFERENZNUMMER = "Referenznummer";
    public static final String REFERENZ_VERSICHERUNGSSCHEINNUMMER = "Referenz-Versicherungsscheinnummer";
    public static final String REFERENZ_VERSICHERUNGSSCHEINNUMMER_1 = "1. Referenz-Versicherungsscheinnummer";
    public static final String REFERENZ_VERSICHERUNGSSCHEINNUMMER_2 = "2. Referenz-Versicherungsscheinnummer";
    public static final String REFERENZ_VERSICHERUNGSSCHEINNUMMER_3 = "3. Referenz-Versicherungsscheinnummer";
    public static final String REGISTRIERUNGSNUMMER_VERMITTLER = "Registrierungsnummer Vermittler";
    public static final String RESTLAUFZEIT_VERTRAG = "Restlaufzeit des Vertrages";
    public static final String RISIKOGRUPPE_RISIKOART = "Risikogruppe / Risikoart";
    public static final String RISIKOGRUPPE_RISIKOART1 = "Risikogruppe / Risikoart";
    public static final String RISIKOGRUPPE_RISIKOART2 = "Risikogruppe / Risikoart";
    public static final String RISIKOTEXT = "Risikotext";
    public static final String RISIKOVERLAUF = "Risikoverlauf";
    public static final String RISKIOEINHEIT1 = "Risikoeinheit-1";
    public static final String RISKIOEINHEIT2 = "Risikoeinheit-2";
    public static final String ROHBAU_EINMALBETRAG = "Rohbau-Einmalbetrag";
    public static final String RUECKFUEHRUNGSKOSTEN = "Rueckfuehrungskosten";
    public static final String SAISONKENNZEICHEN = "Saisonkennzeichen";
    public static final String SATZART = "Satzart";
    public static final String SATZNUMMER = "Satznummer";
    public static final String SATZNUMMER1 = "Satznummer";
    public static final String SATZNUMMER2 = "Satznummer";
    public static final String SATZNUMMER3 = "Satznummer";
    public static final String SATZNUMMER4 = "Satznummer";
    public static final String SATZNUMMER5 = "Satznummer";
    public static final String SATZNUMMER9 = "Satznummer";
    public static final String SATZNUMMERWIEDERHOLUNG = "Satznummerwiederholung";
    public static final String SATZNUMMERWIEDERHOLUNG1 = "Satznummerwiederholung1";
    public static final String SATZNUMMERWIEDERHOLUNG2 = "Satznummerwiederholung2";
    public static final String SATZNUMMERWIEDERHOLUNG3 = "Satznummerwiederholung3";
    public static final String SATZNUMMERWIEDERHOLUNG4 = "Satznummerwiederholung4";
    public static final String SATZNUMMERWIEDERHOLUNG9 = "Satznummerwiederholung9";
    public static final String SCHADENBEARBEITUNGSKOSTEN = "Schadenbearbeitungskosten";
    public static final String SCHLUESSEL_SICHERUNGSEINRICHTUNG = "Schluessel Sicherungseinrichtung";
    public static final String SCHUTZBRIEF_VERKEHRSSERVICE = "Schutzbrief /Verkehrsservice";
    public static final String SELBSTBETEILIGUNG = "Selbstbeteiligung";
    public static final String SELBSTBETEILIGUNG_IN_PROZENT = "Selbstbeteiligung in %";
    public static final String SELBSTBETEILIGUNG_IN_WAEHRUNGSEINHEITEN = "Selbstbeteiligung";
    public static final String SELBSTBETEILIGUNG_IN_WE_MAX = "Selbstbeteiligung in WE (max.)";
    public static final String SELBSTBETEILIGUNG_IN_WE_MIND = "Selbstbeteiligung in WE (mind.)";
    public static final String SERVICELEISTUNGEN = "Serviceleistungen";
    public static final String SERVICELEISTUNGEN_BEITRAGSSATZ = "Serviceleistungen Beitragssatz";
    public static final String SICHERUNGSEINRICHTUNG = "Sicherungseinrichtung";
    public static final String SICHERUNGSGLAEUBIGER = "Sicherungsglaeubiger";
    public static final String SICHERUNGSSCHEIN = "Sicherungsschein";
    public static final String SONDERBEDINGUNGEN = "Sonderbedingungen";
    public static final String SONDERBEDINGUNGEN_KLAUSELN = "Sonderbedingungen / Klauseln";
    public static final String SONDERVEREINBARUNGEN = "Sondervereinbarungen";
    public static final String SONSTIGER_BEZUGSBERECHTIGTER_IM_LEISTUNGSFALL = "Sonstigter Bezugsberechtigter im Leistungsfall";
    public static final String SPARTE = "Sparte";
    public static final String SPEZIFIKATION_REFERENZ_VERSICHERUNGSSCHEINNUMMER = "Spezifikation der Referenz-Versicherungsscheinnummer";
    public static final String STAATSANGEHOERIGKEIT = "Staatsangehoerigkeit";
    public static final String STAERKE = "Staerke";
    public static final String STAERKEEINHEIT = "Staerkeeinheit";
    public static final String STEUERNR_JURISTISCHE_PERSON = "Steuernummer bei juristischen Personen";
    public static final String STOCKWERKE = "Stockwerke";
    public static final String STRASSE = "Strasse";
    public static final String STURMZONE = "Sturmzone";
    public static final String TAGEGELD1 = "Tagegeld 1";
    public static final String TAGEGELD1_BEITRAGSSATZ = "Tagegeld 1 Beitragssatz";
    public static final String TAGEGELD2 = "Tagegeld 2";
    public static final String TAGEGELD2_BEITRAGSSATZ = "Tagegeld 2 Beitragssatz";
    public static final String TARIF = "Tarif";
    public static final String TARIFBEITRAG_100_PROZENT_FUER_KRAFTFAHRT_FAHRZEUGTEIL_IN_WAEHRUNGSEINHEITEN = "Tarifbeitrag 100 % fuer Kraftfahrt-Fahrzeugteil";
    public static final String TARIFBEITRAG_100_PROZENT_FUER_KRAFTFAHRT_FAHRZEUGVOLL_IN_WAEHRUNGSEINHEITEN = "Tarifbeitrag 100 % fuer Kraftfahrt-Fahrzeugvoll";
    public static final String TARIFBEITRAG_100_PROZENT_FUER_KRAFTFAHRT_HAFTPFLICHT_IN_WAEHRUNGSEINHEITEN = "Tarifbeitrag 100 % fuer Kraftfahrt-Haftpflicht";
    public static final String TARIFBEZEICHNUNG = "Tarifbezeichnung";
    public static final String TARIFIERUNGSMERKMAL_LAUFZEIT = "Tarifierungsmerkmal Laufzeit";
    public static final String TARIFJAHR = "Tarifjahr";
    public static final String TITEL = "Titel";
    public static final String TOD = "Tod";
    public static final String TOD_BEITRAGSSATZ = "Tod-Beitragssatz";
    public static final String TRAEGERUNTERNEHMEN_NAME = "Traegerunternehmen Name";
    public static final String TRAEGERUNTERNEHMEN_SCHLUESSEL = "Traegerunternehmen Schluessel";
    public static final String TYKLASSE_KH = "Tyklasse KH";
    public static final String TYPKLASSE_FUER_KFT = "Typklasse fuer KFT";
    public static final String TYPKLASSE_FUER_KFV = "Typklasse fuer KFV";
    public static final String TYPSCHLUESSEL_NR = "Typschluessel-Nr.";
    public static final String TYP_BANKVERBINDUNG1 = "Typ der Bankverbindung 1";
    public static final String TYP_BANKVERBINDUNG2 = "Typ der Bankverbindung 2";
    public static final String UEBERFUEHRUNGSKOSTEN = "Ueberfuehrungskosten";
    public static final String UEBERGANGSENTSCHAEDIGUNG = "Uebergangsentschaedigung";
    public static final String UEBERGANGSENTSCHAEDIGUNG_BEITRAGSSATZ = "Uebergangsentschaedigung Beitragssatz";
    public static final String UMBAUTER_RAUM = "umbauter Raum";
    public static final String UMSATZSTEUER_ID = "Umsatzsteuer-Identifikationsnummer";
    public static final String UNBEKANNT = "unbekannt";
    public static final String UNTERSTUETZUNGSKASSE_NAME = "Unterstuetzungskasse Name";
    public static final String UNTERSTUETZUNGSKASSE_SCHLUESSEL = "Unterstuetzungskasse Schluessel";
    public static final String UNVERFALLBARKEIT = "Unverfallbarkeit";
    public static final String UNWIDERRUFLICHES_BEZUGSRECHT_IM_LEISTUNGSFALL = "Unwiderrufliches Bezugsrecht im Leistungsfall";
    public static final String VERKUERZTE_BEITRAGSZAHLUNGSDAUER = "verkuerzte Beitragszahlungsdauer";
    public static final String VERMITTLER = "Geschaeftsstelle/Vermittler";
    public static final String VERSICHERTES_OBJEKT = "Versichertes Objekt";
    public static final String VERSICHERTE_GEFAHREN = "Versicherte Gefahren";
    public static final String VERSICHERUNGSLEISTUNGEN = "Versicherungsleistungen";
    public static final String VERSICHERUNGSSCHEINNUMMER = "Versicherungsschein-Nummer";
    public static final String VERSICHERUNGSSCHEINNUMMER_VM = "Versicherungsscheinnummer VM";
    public static final String VERSION_SATZART_9999 = "Version Satzart 9999 Nachsatz";
    public static final String VERSION_SATZART_0001 = "Version Satzart 0001";
    public static final String VERSION_SATZART_0100 = "Version Satzart 0100";
    public static final String VERSION_SATZART_0200 = "Version Satzart 0200";
    public static final String VERSION_SATZART_0210_050 = "Version Satzart 0210 050";
    public static final String VERSION_SATZART_0220_051 = "Version Satzart 0220 051";
    public static final String VERSION_SATZART_0220_052 = "Version Satzart 0220 052";
    public static final String VERSION_SATZART_0220_053 = "Version Satzart 0220 053";
    public static final String VERSION_SATZART_0220_054 = "Version Satzart 0220 054";
    public static final String VERSION_SATZART_0220_059 = "Version Satzart 0220 059";
    public static final String VERSION_SATZART_0210_040 = "Version Satzart 0210 040";
    public static final String VERSION_SATZART_0220_040 = "Version Satzart 0220 040";
    public static final String VERSION_SATZART_0210_030 = "Version Satzart 0210 030";
    public static final String VERSION_SATZART_0220_030 = "Version Satzart 0220 030";
    public static final String VERSION_SATZART_0210_010 = "Version Satzart 0210 010";
    public static final String VERSION_SATZART_0220_010 = "Version Satzart 0220 010";
    public static final String VERSION_SATZART_0210_130 = "Version Satzart 0210 130";
    public static final String VERSION_SATZART_0220_130 = "Version Satzart 0220 130";
    public static final String VERSION_SATZART_0210_110 = "Version Satzart 0210 110";
    public static final String VERSION_SATZART_0220_110 = "Version Satzart 0220 110";
    public static final String VERSION_SATZART_0210_140 = "Version Satzart 0210 140";
    public static final String VERSION_SATZART_0220_140 = "Version Satzart 0220 140";
    public static final String VERSION_SATZART_0210_020 = "Version Satzart 0210 020";
    public static final String VERSION_SATZART_0220_020 = "Version Satzart 0220 020";
    public static final String VERSION_SATZART_0210_070 = "Version Satzart 0210 070";
    public static final String VERSION_SATZART_0220_070 = "Version Satzart 0220 070";
    public static final String VERSION_SATZART_0210_FEUER = "Version Satzart 0210 Feuer-Industrie/Gewerbliche Sachversicherung";
    public static final String VERSION_SATZART_0220_FEUER = "Version Satzart 0220 Feuer-Industrie/Gewerbliche Sachversicherung";
    public static final String VERSION_SATZART_0210_510 = "Version Satzart 0210 510";
    public static final String VERSION_SATZART_0220_510 = "Version Satzart 0220 510";
    public static final String VERSION_SATZART_0210_TECH_VERS = "Version Satzart 0210 Technische Versicherungen";
    public static final String VERSION_SATZART_0220_TECH_VERS = "Version Satzart 0220 Technische Versicherungen";
    public static final String VERSION_SATZART_0210_TRANSPORT = "Version Satzart 0210 Transport";
    public static final String VERSION_SATZART_0220_TRANSPORT = "Version Satzart 0220 Transport";
    public static final String VERSION_SATZART_0250_TRANSPORT = "Version Satzart 0250 Transport Einzelanmeldung";
    public static final String VERSION_SATZART_0260_TRANSPORT = "Version Satzart 0260 Transport Umsatzanmeldung";
    public static final String VERSION_SATZART_0210_NICHT_DEF_SPARTEN = "Version Satzart 0210 Nicht einzeln definierte Sparten";
    public static final String VERSION_SATZART_0220_NICHT_DEF_SPARTEN = "Version Satzart 0220 Nicht einzeln definierte Sparten";
    public static final String VERSION_KFZ_BAUSTEIN = "Version KFZ-Baustein";
    public static final String VERSION_SATZART_0300_BETEILIGUNGSINFORMATION = "Version Satzart 0300 Beteiligungsinformation";
    public static final String VERSION_SATZART_0400_INKASSO = "Version Satzart 0400 Inkasso";
    public static final String VERSION_SATZART_0410_INKASSO = "Version Satzart 0410 Inkasso";
    public static final String VERSION_SATZART_0430_INKASSO = "Version Satzart 0430 Inkasso";
    public static final String VERSION_SATZART_0500_SCHADENINFORMATION = "Version Satzart 0500 Schadeninformation";
    public static final String VERSION_SATZART_0420_VERSICHERUNGSTEUERABRECHNUNG = "Version Satzart 0420 Versicherungsteuerabrechnung";
    public static final String VERSION_SATZART_0450_INKASSOABRECHNUNG = "Version Satzart 0450 Inkassoabrechnung";
    public static final String VERSION_SATZART_0550_SCHADENABRECHNUNG = "Version Satzart 0550 Schadenabrechnung";
    public static final String VERSION_SATZART_0350_KLAUSELN = "Version Satzart 0350 Klausel";
    public static final String VERSION_SATZART_0211_050 = "Version Satzart 0211 050";
    public static final String VERSION_SATZART_0221_051 = "Version Satzart 0221 051";
    public static final String VERSION_SATZART_0221_052 = "Version Satzart 0221 052";
    public static final String VERSION_SATZART_0221_053 = "Version Satzart 0221 053";
    public static final String VERSION_SATZART_0221_054 = "Version Satzart 0221 054";
    public static final String VERSION_SATZART_0221_055 = "Version Satzart 0221 055";
    public static final String VERSION_SATZART_0221_059 = "Version Satzart 0221 059";
    public static final String VERSION_SATZART_0211_040 = "Version Satzart 0211 040";
    public static final String VERSION_SATZART_0221_040 = "Version Satzart 0221 040";
    public static final String VERSION_SATZART_0221_030 = "Version Satzart 0221 030";
    public static final String VERSION_SATZART_0211_010 = "Version Satzart 0211 010";
    public static final String VERSION_SATZART_0221_010 = "Version Satzart 0221 010";
    public static final String VERSION_SATZART_0211_130 = "Version Satzart 0211 130";
    public static final String VERSION_SATZART_0221_130 = "Version Satzart 0221 130";
    public static final String VERSION_SATZART_0211_110 = "Version Satzart 0211 110";
    public static final String VERSION_SATZART_0221_110 = "Version Satzart 0221 110";
    public static final String VERSION_SATZART_0211_140 = "Version Satzart 0211 140";
    public static final String VERSION_SATZART_0221_140 = "Version Satzart 0221 140";
    public static final String VERSION_SATZART_0221_070 = "Version Satzart 0221 070";
    public static final String VERSION_SATZART_0211_FEUER = "Version Satzart 0211 Feuer-Industrie/Gewerbliche Sachversicherung";
    public static final String VERSION_SATZART_0221_FEUER = "Version Satzart 0221 Feuer-Industrie/Gewerbliche Sachversicherung";
    public static final String VERSION_SATZART_0221_510 = "Version Satzart 0221 510";
    public static final String VERSION_SATZART_0211_TRANSPORT = "Version Satzart 0211 Transport";
    public static final String VERSION_SATZART_0221_TRANSPORT = "Version Satzart 0221 Transport";
    public static final String VERSION_SATZART_0251_TRANSPORT = "Version Satzart 0251 Transport Einzelanmeldung";
    public static final String VERSION_SATZART_0211_NICHT_DEF_SPARTEN = "Version Satzart 0211 Nicht einzeln definierte Sparten";
    public static final String VERSION_SATZART_0221_NICHT_DEF_SPARTEN = "Version Satzart 0221 Nicht einzeln definierte Sparten";
    public static final String VERSION_SATZART_0210_550 = "Version Satzart 0210 550";
    public static final String VERSION_SATZART_0220_550 = "Version Satzart 0220 550";
    public static final String VERSION_SATZART_0270_550 = "Version Satzart 0270 550";
    public static final String VERSION_SATZART_0280_550 = "Version Satzart 0280 550";
    public static final String VERSION_SATZART_0291_550 = "Version Satzart 0291 550";
    public static final String VERSION_SATZART_0292_550 = "Version Satzart 0292 550";
    public static final String VERSION_SATZART_0293_550 = "Version Satzart 0293 550";
    public static final String VERSION_SATZART_0294_550 = "Version Satzart 0294 550";
    public static final String VERSION_SATZART_0295_550 = "Version Satzart 0295 550";
    public static final String VERSION_SATZART_0052 = "Version Satzart 0051";
    public static final String VERSION_SATZART_0102 = "Version Satzart 0102";
    public static final String VERSION_SATZART_0212 = "Version Satzart 0212";
    public static final String VERSION_SATZART_0352 = "Version Satzart 0352";
    public static final String VERSION_SATZART_0362 = "Version Satzart 0362";
    public static final String VERSION_SATZART_0382 = "Version Satzart 0382";
    public static final String VERSION_SATZART_9950 = "Version Satzart 9950";
    public static final String VERSION_SATZART_9952 = "Version Satzart 9952";
    public static final String VERSION_SATZART_0210_580 = "Version Satzart 0210 580";
    public static final String VERSION_SATZART_0220_580 = "Version Satzart 0220 580";
    public static final String VERSION_SATZART_0372 = "Version Satzart 0372";
    public static final String VERSION_SATZART_0600 = "Version Satzart 0600";
    public static final String VERTRAGSABLAUF = "Vertragsablauf";
    public static final String VERTRAGSBEGINN = "Vertragsbeginn";
    public static final String VERTRAGSFORM = "Vertragsform";
    public static final String VERTRAGSSTATUS = "Vertragsstatus";
    public static final String VORAUSSICHTLICHES_ENDE = "voraussichtliches Ende";
    public static final String VORLAUFSSUMME_IN_WAEHRUNGSEINHEITEN = "Vorlaufsumme";
    public static final String VORNAME_VP = "Vorname der VP";
    public static final String VORSTEUERABZUGSBERECHTIGT = "Vorsteuerabzugsberechtigt";
    public static final String VORZUGSSEUERBERECHTIGUNG_PROZENT = "Vorsteuerabszugsberechtigung in Prozent";
    public static final String VORZUGSSTEUERBERECHTIGUNG = "Vorsteuerabszugsberechtigung Ja/Nein";
    public static final String VP_PERSONENNUMMER_VERMITTLER = "VP-Personnenummer des Vermittlers";
    public static final String VP_PERSONENNUMMER_VERSICHERER = "VP-Personnenummer des Versicherers";
    public static final String VU_ABRECHNUNGSSTELLE = "VU-Abrechnungsstelle";
    public static final String VU_NUMMER = "VU-Nummer";
    public static final String WAEHRUNGSSCHLUESSEL = "Waehrungsschluessel";
    public static final String WAEHRUNG_DOKUMENTE_FUER_VN = "Waehrung der Dokumente fuer VN";
    public static final String WAGNIS = "Wagnis";
    public static final String WAGNISKENNZIFFER = "Wagniskennziffer";
    public static final String WARTEZEIT = "Wartezeit";
    public static final String WEITERE_REFERENZNUMMERN = "Weitere Referenznummern";
    public static final String WOHNEIGENTUM = "Wohneigentum";
    public static final String ZAHLUNGSANFANG = "Zahlungsanfang";
    public static final String ZAHLUNGSART = "Zahlungsart /-weg";
    public static final String ZAHLUNGSWEISE = "Zahlungsweise";
    public static final String ZAHLUNGSWEISE_KUENFTIGER_GESAMTBETRAG = "Zahlungsweise des kuenftigen Gesamtbetrags";
    public static final String ZIELGRUPPENSCHLUESSEL = "Zielgruppenschluessel";
    public static final String ZUKUENFTIGER_GESAMTBEITRAG_IN_WAEHRUNGSEINHEITEN = "Zukuenftiger Gesamtbeitrag";
    public static final String ZUSAETZLICHE_SATZKENNUNG = "zusaetzliche Satzkennung";
    public static final String ZUSCHLAG1_IN_PROZENT = "Zuschlag-1 in %";
    public static final String ZUSCHLAG1_IN_WAEHRUNGSEINHEITEN = "Zuschlag-1";
    public static final String ZUSCHLAG2_IN_PROZENT = "Zuschlag-2 in %";
    public static final String ZUSCHLAG2_IN_WAEHRUNGSEINHEITEN = "Zuschlag-2";
    public static final String ZUSCHLAGSBETRAG_IN_WAEHRUNGSEINHEITEN = "Zuschlagsbetrag";
    public static final String ZUSCHLAG_IN_PROZENT = "Zuschlag in %";
    public static final String ZUZAHLUNGSBETRAG_IN_WAEHRUNGSEINHEITEN = "Zuzahlungsbetrag";
    public static final String ZUZAHLUNGSDATUM = "Zuzahlungsdatum";
    public static final String ZUZAHLUNGSRECHT = "Zuzahlungsrecht";

    public static final String VERSION_SATZART_0392_EVB = "Version Satzart 0392 eVB-Nummer";
    public static final String VERSION_SATZART_0230_LEBEN = "Version Satzart 0230 Fondsdatensatz - Leben";
    public static final String VERSION_SATZART_0202_ALLG_ANTRAGSDATEN = "Version Satzart 0202 Allgemeine Antragsdaten";
    public static final String VERSION_SATZART_0230_UNFALL = "Version Satzart 0230 Unfall Leistungsarten";
    public static final String VERSION_SATZART_0390_RABATTE = "Version Satzart 0390 Rabatte und Zuschlaege";
    public static final String VERSION_SATZART_0342_BEGLEITDOK = "Version Satzart 0342 Begleitdokumente und Signaturen";
    public static final String VERSION_SATZART_9951_MIME = "Version Satzart 9951 MIME-Datei";
    public static final String VERSION_SATZART_0210_560 = "Version Satzart 0210 560";
    public static final String VERSION_SATZART_0220_560 = "Version Satzart 0220 560";
    public static final String VERSION_SATZART_0210_570 = "Version Satzart 0210 570";
    public static final String VERSION_SATZART_0220_570 = "Version Satzart 0220 570";
    public static final String VERSION_SATZART_0210_684 = "Version Satzart 0210 684";
    public static final String VERSION_SATZART_0220_684 = "Version Satzart 0220 684";
    public static final String INTERNES_ORDNUNGSMERKMAL_DES_VM = "Internes Ordnungsmerkmal des VM";
    public static final String FAELLIGKEIT_DER_LETZTEN_BEITRAGSZAHLUNG = "Faelligkeit der letzten Beitragszahlung";
    public static final String LEBENSLANGE_BEITRAGSZAHLUNG = "Lebenslange Beitragszahlung";
    public static final String BESONDERE_VEREINBARUNGEN = "Besondere Vereinbarungen";
    public static final String DIREKTANSPRUCH = "Direktanspruch";
    public static final String EINTRITTSALTER_DER_VP = "Eintrittsalter der VP";
    public static final String ALTERSGRUPPE = "Altersgruppe";
    public static final String BEITRAGSZAHLUNG_BIS = "Beitragszahlung bis";
    public static final String RUECKGEWAEHRDATUM = "Rueckgewaehrdatum";
    public static final String RUECKGEWAEHRSUMME_ZUM_ABLAUF_IN_WAEHRUNGSEINHEITEN = "Rueckgewaehrsumme zum Ablauf";
    public static final String ABLAUFLEISTUNG_INKL_UEBERSCHUSSANTEILE_IN_WAEHRUNGSEINHEITEN = "Ablaufleistung incl. Ueberschussanteile";
    public static final String KAPITALERTRAGSSTEUER_BEI_ABLAUF = "Kapitalertragssteuer bei Ablauf";
    public static final String SOLIDARITAETSZUSCHLAG_BEI_ABLAUF = "Solidarit\u00e4tszuschlag bei Ablauf";
    public static final String RUECKKAUFSWERT_ZUM_BERECHNUNGSSTICHTAG_IN_WAEHRUNGSEINHEITEN = "Rueckkaufswert zum Berechnungsstichtag";
    public static final String BERECHNUNGSSTICHTAG_ZUM_RUECKKAUFSWERT = "Berechnungsstichtag zum Rueckkaufswert";
    public static final String KAPITALERTRAGSSTEUER_BEI_RUECKKAUF_ZUM_BERECHNUNGSSTICHTAG = "Kapitalertragssteuer bei Rueckkauf zum Berechnungsstichtag";
    public static final String SOLIDARITAETSZUSCHLAG_BEI_RUECKKAUF_ZUM_BERECHNUNGSSTICHTAG = "Solidarit\u00e4tszuschlag bei Rueckkauf zum Berechnungsstichtag";
    public static final String UEBERSCHUSSANTEILE_ZUM_BERECHNUNGSSTICHTAG_IN_WAEHRUNGSEINHEITEN = "Ueberschussanteile zum Berechnungsstichtag";
    public static final String GEBURTSDATUM_DER_BEZUGSBERECHTIGTEN_PERSON = "Geburtsdatum der bezugsberechtigten Person";

    public static final String ANZAHL_DER_VERSICHERTEN_PERSONEN = "Anzahl der versicherten Personen";
    public static final String DATUM_UNVERFALLBARKEIT = "Datum Unverfallbarkeit";
    public static final String DIENSTEINTRITT = "Diensteintritt";
    public static final String GEBURTSDATUM_VP = "Geburtsdatum der VP";
    public static final String GEBURTSDATUM_VP2 = "Geburtsdatum der VP2";
    public static final String GESCHLECHT_VP = "Geschlecht der VP";
    public static final String LFD_NUMMER_ZUR_WAGNISART = "Lfd Nummer zur Wagnisart";
    public static final String MITARBEITER_STATUS = "Mitarbeiter Status";
    public static final String PERSONEN_KUNDENNUMMER_DES_VERMITTLERS = "Personen Kundennummer des Vermittlers";
    public static final String SOZIALVERSICHERUNG_NUMMER = "Sozialversicherung Nummer";
    public static final String STATUS_SEIT = "Status seit";
    public static final String WAGNISART = "Wagnisart";

    public static final String VORZEICHEN = "Vorzeichen";
    public static final String VORZEICHEN2 = "Vorzeichen";
    public static final String VORZEICHEN3 = "Vorzeichen";
    public static final String VORZEICHEN4 = "Vorzeichen";
    public static final String VORZEICHEN5 = "Vorzeichen";

    public static final String ERLEBENSFALL_VS_IN_WAEHRUNGSEINHEIT_ZUM_ABLAUF = "Erlebensfall VS zum Ablauf";
    public static final String TODESFALL_VS_IN_WAEHRUNGSEINHEIT_ZUM_ABLAUF = "Todesfall VS zum Ablauf";
    public static final String ERLEBENSFALL_VS_II_IN_WAEHRUNGSEINHEIT_ZUM_ABLAUF = "Erlebensfall VS II zum Ablauf";
    public static final String BEITRAGSFREIE_ERLEBENSFALL_VS_IN_WAEHRUNGSEINHEITEN = "Beitragsfreie Erlebensfall VS";
    public static final String ABSOLUTER_DYNAMIKERHOEHUNGSBETRAG = "Absoluter Dynamikerhoehungsbetrag";
    public static final String ERLEBENSFALL_VS_IN_WAEHRUNGSEINHEITEN_ZUM_BEGINN_DER_ABRUFPHASE = "Erlebensfall VS zum Beginn der Abrufphase";
    public static final String TODESFALL_VS_IN_WAEHRUNGSEINHEITEN_ZUM_BEGINN_DER_ABRUFPHASE = "Todesfall VS zum Beginn der Abrufphase";
    public static final String ERLEBENSFALL_VS_II_IN_WAEHRUNGSEINHEITEN_ZUM_BEGINN_DER_ABRUFPHASE = "Erlebensfall VS II zum Beginn der Abrufphase";

    public static final String ANFAENGLICHE_ERLEBENSFALL_VS_IN_WAEHRUNGSEINHEITEN = "Anfaengliche Erlebensfall VS";
    public static final String AENDERUNG_DER_ERLEBENSFALL_VS = "Aenderung der Erlebensfall VS";
    public static final String ABSTAND_DER_ERLEBENSFAL_VS_AENDERUNGSTERMINE = "Abstand der Erlebensfall VS-Aenderungstermine";
    public static final String ERLEBENSFALL_VS_AENDERUNGS_PROZENTSATZ = "Erlebensfall VS-Aenderungs-Prozentsatz";
    public static final String ABSOLUTE_ERLEBENSFALL_VS_IN_WAEHRUNGSEINHEITEN = "Absolute Erlebensfall VS";
    public static final String NAECHSTE_ERLEBENSFALL_VS_IN_WAEHRUNGSEINHEITEN = "Naechste Erlebensfall VS";
    public static final String BEGINNDATUM_DER_NAECHSTEN_ERLEBENSFALL_VS = "Beginndatum der naechsten Erlebensfall VS";

    public static final String BEITRAG_BU_IN_WAEHRUNGSEINHEITEN = "Beitrag BU";
    public static final String EINSCHLUSS_PROZENT_SATZ = "Einschluss %-Satz";
    public static final String ZWANG_ZUR_BUZ = "Zwang zur BUZ";
    public static final String LEISTUNGSDAUER = "Leistungsdauer";
    public static final String BUZ_VERWENDUNGSART = "BUZ Verwendungsart";
    public static final String RENTE_INCL_UEBERSCHUSSBETEILIGUNG_IN_WAEHRUNGSEINHEITEN = "Rente inkl. Ueberschussbeteiligung";
    public static final String BUZ_LEISTUNG_VON = "BUZ Leistung von";
    public static final String BUZ_LEISTUNG_BIS = "BUZ Leistung bis";
    public static final String BUZ_PROZENT_SATZ = "BUZ %-Satz";
    public static final String KARENZZEIT = "Karenzzeit";
    public static final String ABWEICHENDE_LEISTUNGSDAUER = "Abweichende Leistungsdauer";
    public static final String ZUKUENFTIGER_BEITRAG = "Zukuenftiger Beitrag";
    public static final String ABSOLUTER_DYNAMIKERHOEHUNGSBETRAG_IN_WAERHUNGSEINHEITEN = "Absoluter Dynamikerhoehungsbetrag";

    public static final String ERLEBENSFALL_VS_IN_WAEHRUNGSEINHEIT = "Erlebensfall VS";
    public static final String TODESFALL_VS_IN_WAEHRUNGSEINHEIT = "Todesfall VS";
    public static final String ERLEBENSFALL_VS2_IN_WAEHRUNGSEINHEIT = "Erlebensfall VS II";
    public static final String BEITRAGSFREIE_ERLEBENSFALL_VS_IN_WAEHRUNGSEINHEIT = "Beitragsfreie Erlebensfall VS";
    public static final String BEITRAGSFREIE_TODESFALL_VS_IN_WAEHRUNGSEINHEIT = "Beitragsfreie Todesfall VS";

    public static final String VERSICHERUNGSSUMME_IN_WAEHRUNGSEINHEITEN = "Versicherungssumme";
    public static final String FALLENDE_SUMME = "fallende Summe";
    public static final String RENTE_INKL_UEBERSCHUSSANRECHNUNG_IN_WAEHRUNGSEINHEITEN = "Rente inkl. Ueberschussanrechnung";

    public static final String ABSOLUTE_UNFALLAENDERUNGSSUMME_IN_WAEHRUNGSEINHEITEN = "Absolute Unfallaenderungssumme";
    public static final String NAECHSTE_UNFALLSUMME_IN_WAEHRUNGSEINHEITEN = "Naechste Unfallsumme";

    public static final String ANFAENGLICHE_UNFALLSUMME = "Anfaengliche Unfallsumme";
    public static final String AENDERUNG_DER_UNFALLLEISTUNG = "Aenderung der Unfallleistung";
    public static final String ABSTAND_DER_UNFALLAENDERUNGSTERMINE = "Abstand der Unfallaenderungstermine";
    public static final String UNFALLAENDERUNGS_PROZENTSATZ = "Unfallaenderungs-Prozentsatz";
    public static final String BEGINNDATUM_DER_NAECHSTEN_UNFALLSUMME = "Beginndatum der naechsten Unfallsumme";

    public static final String BEITRAG_PROMILLE = "Beitrag Promille";
    public static final String UNFALLSUMME_IN_WAEHRUNGSEINHEITEN = "Unfallsumme";
    public static final String RISIKOZUSCHLAG = "Risikozuschlag";

    public static final String LFD_NUMMER_DES_FONDS = "Lfd. Nummer des Fonds";
    public static final String WERTPAPIERKENNNUMMER = "Wertpapierkennnummer";
    public static final String FONDSKENNUNG = "Fondskennung";
    public static final String ISIN_NUMMER = "ISIN-Nummer";
    public static final String FONDSNAME = "Fondname";
    public static final String THESAUR = "Thesaur";
    public static final String ANTEILE = "Anteile";
    public static final String BEZUGSDATUM = "Bezugsdatum";
    public static final String PROZENTSATZ = "Prozentsatz";
    public static final String BEGINNDATUM_DER_NAECHSTEN_JAHRESRENTESUMME = "Beginndatum der naechsten Jahresrentensumme";
    public static final String GUTHABEN_DIVID_ANSAMMLUNG_IN_WAEHRUNGSEINHEITEN = "Guthaben Divid. Ansammlung";
    public static final String NETTOBEITRAG_IN_WAEHRUNGSEINHEITEN2 = "Nettobeitrag";
    public static final String GARANTIERTE_FONDSJAHRESRENTE_ZUM_ABLAUF_INKL_ABRUFPHASE = "Garantierte Fondsjahresrente zum Ablauf (inkl. Abrufphase)";
    public static final String GARANTIERTE_FONDSJAHRESRENTE_ZUM_BEGINN_DER_ABRUFPHASE = "Garantierte Fondsjahresrente zum Beginn der Abrufphase";
    public static final String AKTUELLE_FONDSJAHRESRENTE_ZUM_ABLAUF_INKL_ABRUFPHASE = "Aktuelle Fondsjahresrente zum Ablauf (inkl. Abrufphase)";
    public static final String AKTUELLE_FONDSJAHRESRENTE_ZUM_BEGINN_DER_ABRUFPHASE = "Aktuelle Fondsjahresrente zum Beginn der Abrufphase";
    public static final String WAGNISART4 = "Wagnisart";
    public static final String LFD_NUMMER_ZUR_WAGNISART4 = "Lfd. Nummer zur Wagnisart";
    public static final String ABSOLUTE_TODESFALLAENDERUNGSSUMME_IN_WAEHRUNGSEINHEITEN = "Absolute Todesfallaenderungssumme";
    public static final String AENDERUNG_DER_BEITRAGSSUMME = "Aenderung der Beitragssumme";
    public static final String ABSTAND_DER_BEITRAGSSUMMENAENDERUNGSTERMINE = "Abstand der Beitragssummenaenderungstermine";
    public static final String BEITRAGSSUMMENAENDERUNGS_PROZENTSATZ = "Beitragssummenaenderungs-Prozentsatz";
    public static final String ABSOLUTE_BEITRAGSSUMMENAENDERUNGSSUMME_IN_WAEHRUNGSEINHEITEN = "Absolute Beitragssummenaenderungssumme";
    public static final String NAECHSTE_BEITRAGSSUMME_IN_WAEHRUNGSEINHEITEN = "Naechste Beitragssumme";
    public static final String BEGINNDATUM_DER_NAECHSTEN_BEITRAGSSUMME = "Beginndatum der naechsten Beitragssumme";
    public static final String BEITRAGSSUMME_IN_WAEHRUNGSEINHEITEN = "Beitragssumme";
    public static final String TODESFALL_VS_IN_WAEHRUNGSEINHEITEN = "Todesfall VS";
    public static final String FALLENDE_VS = "fallende VS";
    public static final String ERLEBENSFALL_VS_II_IN_WAEHRUNGSEINHEITEN = "Erlebensfall VS II";
    public static final String BEITRAGSFREIE_BEITRAGSSUMME_IN_WAEHRUNGSEINHEITEN = "Beitragsfreie Beitragssumme";
    public static final String BEITRAGSFREIE_TODESFALL_VS_IN_WAEHRUNGSEINHEITEN = "Beitragsfreie Todesfall VS";
    public static final String LAUFZEITVERKUERZUNG = "Laufzeitverkuerzung";
    public static final String VERTRAG_MIT_ZUWACHSGARANTIE = "Vertrag mit Zuwachsgarantie";
    public static final String TODESFALLLEISTUNG_IN_PROZENT = "Todesfallleistung in %";
    public static final String SPARVORGANG = "Sparvorgang";
    public static final String GESTUNDET_AUSGESETZT_BIS = "Gestundet ausgesetzt bis";
    public static final String ANLAGESTRATEGIE = "Anlagestrategie";
    public static final String ERLEBENSFALL_VS_IN_WAEHRUNGSEINHEITEN = "Erlebensfall VS";
    public static final String GUTHABEN_DIVID_ANSAMMLUNG_IN_WAEHRUNGSEINHEIT = "Guthaben Divid. Ansammlung";
    public static final String KAPITALZAHLUNGS_SUMME_IN_WAEHRUNGSEINHEIT = "Kapitalzahlungs-Summe";
    public static final String ANFAENGLICHE_TODESFALL_VS_IN_WAEHRUNGSEINHEITEN = "Anfaengliche Todesfall VS";
    public static final String AENDERUNG_DER_TODESFALLLEISTUNG = "Aenderung der Todesfallleistung";
    public static final String ABSTAND_DER_TODESFALLAENDERUNGSTERMINE = "Abstand der Todesfallaenderungstermine";
    public static final String TODESFALLAENDERUNGS_PROZENTSATZ = "Todesfallaenderungs-Prozentsatz";
    public static final String ABSOLUTE_TODESFALLAENDERUNGSSUMME_VS_IN_WAEHRUNGSEINHEITEN = "Absolute Todesfallaenderungssumme VS";
    public static final String NAECHSTE_TODESFALL_VS_IN_WAEHRUNGSEINHEITEN = "Naechste Todesfall VS";
    public static final String BEGINNDATUM_DER_NAECHSTEN_TODESFALL_VS = "Beginndatum der naechsten Todesfall VS";
    public static final String ANFAENGLICHE_JAHRESRENTE_IN_WAEHRUNGSEINHEITEN = "Anfaengliche Jahresrente";
    public static final String AENDERUNG_DER_JAHRESRENTE = "Aenderung der Jahresrente";
    public static final String ABSTAND_DER_JAHRESRENTENAENDERUNGSTERMINE = "Abstand der Jahresrentenaenderungstermine";
    public static final String JAHRESRENTENAENDERUNGS_PROZENTSATZ = "Jahresrentenaenderungs-Prozentsatz";
    public static final String ABSOLUTE_JAHRESRENTENAENDERUNGSSUMME_IN_WAEHRUNGSEINHEITEN = "Absolute Jahresrentenaenderungssumme";
    public static final String NAECHSTE_JAHRESRENTE_IN_WAEHRUNGSEINHEITEN = "Naechste Jahresrente";
    public static final String BEGINNDATUM_DER_NAECHSTEN_JAHRESRENTE = "Beginndatum der naechsten Jahresrente";
    public static final String PROVISIONSPFLICHTIGE_BEITRAGSSUMME_IN_WAEHRUNGSEINHEITEN = "Provisionspflichtige Beitragssumme";
    public static final String PROVISIONSPFLICHTIGE_WERTUNGSSUMME_IN_WAEHRUNGSEINHEITEN = "Provisionspflichtige Wertungssumme";
    public static final String WERTUNGSBASIS = "Wertungsbasis";
    public static final String WERTUNGSMODELL = "Wertungsmodell";
    public static final String BUCHUNGSKENNZEICHEN = "Buchungskennzeichen";
    public static final String HAFTUNGSWERTUNGSSUMME_IN_WAEHRUNGSEINHEITEN = "Haftungswertungssumme";
    public static final String HAFTUNG_AB = "Haftung ab";
    public static final String HAFTUNG_BIS = "Haftung bis";
    public static final String URSPRUENGLICHES_HAFTUNGSBEGINNDATUM = "Urspruengliches Haftungsbeginndatum";
    public static final String PROVISIONSPFLICHTIGE_BEITRAGSSUMME_IN_WAEHRUNGSEINHEITEN2 = "Provisionspflichtige Beitragssumme";
    public static final String PROVISIONSPFLICHTIGE_WERTUNGSSUMME_IN_WAEHRUNGSEINHEITEN2 = "Provisionspflichtige Wertungssumme";
    public static final String WERTUNGSBASIS2 = "Wertungsbasis";
    public static final String WERTUNGSMODELL2 = "Wertungsmodell";
    public static final String BUCHUNGSKENNZEICHEN2 = "Buchungskennzeichen";
    public static final String HAFTUNGSWERTUNGSSUMME_IN_WAEHRUNGSEINHEITEN2 = "Haftungswertungssumme";
    public static final String HAFTUNG_AB2 = "Haftung ab";
    public static final String HAFTUNG_BIS2 = "Haftung bis";
    public static final String BEZUGSBERECHTIGT_IM_ERLEBENSFALL = "Bezugsberechtigt im Erlebensfall";
    public static final String SONSTIGER_BEZUGSBERECHTIGTER_IM_ERLEBENSFALL = "Sonstiger Bezeugsberechtigter im Erlebensfall";
    public static final String BEZUGSRECHTANTEIL_IM_ERLEBENSFALL = "Bezugsrechtanteil im Erlebensfall";
    public static final String UNWIDERRUFLICHES_BEZUGSRECHT_IM_ERLEBENSFALL = "Unwiderrufliches Bezugsrecht im Erlebensfall";
    public static final String BEZUGSBERECHTIGT_IM_TODESFALL = "Bezugsberechtigt im Todesfall";
    public static final String SONSTIGER_BEZUGSBERECHTIGTER_IM_TODESFALL = "Sonstiger Bezugsberechtigter im Todesfall";
    public static final String BEZUGSRECHTANTEIL_IM_TODESFALL = "Bezugsrechtanteil im Todesfall";
    public static final String UNWIDERRUFLICHES_BEZUGSRECHT_IM_TODESFALL = "Unwiderrufliches Bezugsrecht im Todesfall";
    public static final String NAECHSTE_AUSZAHLUNGSSUMMER_IN_WAEHRUNGSEINHEITEN = "Naechste Auszahlungssumme";
    public static final String NAECHSTER_AUSZAHLUNGSTERMIN = "Naechster Auszahlungstermin";
    public static final String AUSZAHLUNGSWEISE = "Auszahlungsweise";
    public static final String ANZAHL_DER_AUSZAHLUNGEN = "Anzahl der Auszahlungen";
    public static final String ABLAUF = "Ablauf";
    public static final String AENDERUNG = "Aenderung";
    public static final String VERTRAGSLAUFZEIT = "Vertragslaufzeit";
    public static final String VERTRAGSART = "Vertragsart";
    public static final String STATUS = "Status";
    public static final String GEWINNVERWENDUNGSART = "Gewinnverwendungsart";
    public static final String UEBERSCHUSS_GUELTIG_AB = "Ueberschuss gueltig ab";
    public static final String RISIKOEINSCHRAENKUNG = "Risikoeinschraenkung";
    public static final String RISIKOZUSCHLAEGE = "Risikozuschlaege";
    public static final String DYNAMIK_PROZENT_SATZ = "Dynamik %-Satz";
    public static final String ERHOEHUNGSBASIS_DYNAMIK = "Erhoehungsbasis Dynamik";
    public static final String DYNAMIKSTOP = "Dynamikstop";
    public static final String DATUM_DER_LETZTEN_POSITIVEN_DYNAMIK = "Datum der letzten positiven Dynamik";
    public static final String RUECKKAUFSWERT_IN_WAEHRUNGSEINHEITEN = "Rueckkaufswert";
    public static final String RUECKKAUFSWERT_IN_WAEHRUNGSEINHEITEN_MIT_NACHKOMMA = "Rueckkaufswert";
    public static final String RUECKKAUFSWERT_GUELTIG_AB = "Rueckkaufswert gueltig ab";
    public static final String GUTHABEN_DIVID_ANSAMMLUNGEN_IN_WAEHRUNGSEINHEITEN = "Guthaben Divid. Ansammlungen";
    public static final String BEGINN_DER_RENTENZAHLUNG = "Beginn der Rentenzahlung";
    public static final String MINDESTLAUFZEIT = "Mindestlaufzeit";
    public static final String RUECKGEWAEHR_BEI_TOD = "Rueckgewaehr bei Tod";
    public static final String JAHRESRENTE_IN_WAEHRUNGSEINHEITEN = "Jahresrente";
    public static final String KAPITALZAHLUNGSSUMME_IN_WAEHRUNGSEINHEITEN = "Kapitalzahlungssumme";
    public static final String WITWEN_WITWERRENTE_IN_PROZENT = "Witwen- / Witwerrente in Prozent";
    public static final String TECHNISCHE_WITWEN_WITTWERRENTE_IN_PROZENT = "Technische Witwen- / Witwerrente in Prozent";
    public static final String WAISENRENTE_IN_PROZENT = "Waisenrente in Prozent";
    public static final String TECHNISCHE_WAISE_IN_PROZENT = "Technische Waisenrente in Prozent";
    public static final String SCHLUSSALTER_DES_WAISEN = "Schlussalter des Waisen";
    public static final String AUSLOESUNG_DER_LEISTUNG = "Ausloesung der Leistung";
    public static final String ZAHLUNG_DER_WITWEN_WITWERRENTE_BIS = "Zahlung der Witwen- / Witwerrente bis";
    public static final String ENDALTER = "Endalter";
    public static final String EINTRITTSALTER = "Eintrittsalter";
    public static final String UMTAUSCHRECHT = "Umtauschrecht";
    public static final String STUNDUNG = "Stundung";
    public static final String BEGINN_ABRUFPHASE = "Beginn Abrufphase";
    public static final String WAGNISART2 = "Wagnisart";
    public static final String LFD_NUMMER_ZUR_WAGNISART2 = "Lfd. Nummer Wagnisart";
    public static final String ABWEICHENDE_VERTRAGSLAUFZEIT = "Abweichende Vertragslaufzeit";
    public static final String ABWEICHENDER_ABLAUF = "Abweichender Ablauf";
    public static final String NETTOBEITRAG_IN_WAEHRUNGSEINHEITEN = "Nettobeitrag";
    public static final String RISIKOZUSCHLAG_IN_WAEHRUNGSEINHEITEN = "Risikozuschlag";
    public static final String RENTENZAHLWEISE = "Rentenzahlweise";
    public static final String MITZUVERSICHERNDE_PERSON = "Mitzuversichernde Person";
    public static final String GEBURTSDATUM_DER_MITZUVERSICHERNDEN_PERSON = "Geburtsdatum der mitzuversichernden Person";
    public static final String GESCHLECHT_DER_MITZUVERSICHERNDEN_PERSON = "Geschlecht der mitzuverschernden Person";
    public static final String TARIFBEZEICHNUNG_DES_FOLGETARIFS = "Tarifbezeichnung des Folgetarifs";
    public static final String UMSTELLUNGSDATUM_DES_FOLGETARIFS = "Umstellungsdatum des Folgetarifs";
    public static final String ZUKUENFTIGER_BEITRAG_IN_WAEHRUNGSEINHEITEN = "Zukuenftiger Beitrag";
    public static final String VERTRAGSBEDINGUNG = "Vertragsbedingung";
    public static final String DYNAMIKBEGINN = "Dynamikbeginn";
    public static final String ABWEICHENDES_DYNAMIKENDALTER = "Abweichendes Dynamikalter";
    public static final String ABSOLUTER_DYNAMIKERHOEHUNGSBETRAG_IN_WAEHRUNGSEINHEITEN = "Absoluter Dynamikerhoehungsbetrag";
    public static final String ANTEILIGER_DYNAMIKPROZENTSATZ = "Anteiliger Dynamikprozentsatz";
    public static final String VEREINBARTER_DYNAMIKMINDESTANPASSUNGSPROZENTSATZ = "Vereinbarter Dynamikmindestanpassungsprozentsatz";
    public static final String VEREINBARTER_DYNAMIKMAXIMALANPASSUNGSPROZENTSATZ = "Vereinbarter Dynamikmaximalanpassungsprozentsatz";
    public static final String ANZAHL_VERBLEIBENDE_DYNAMIKWIDERSPRUECHE = "Anzahl verbleibende Dynamikwidersprueche";
    public static final String WAGNISART3 = "Wagnisart";
    public static final String LFD_NUMMER_ZUR_WAGNISART3 = "Lfd. Numemr Wagnisart";
    public static final String LEISTUNG_BEI_SCHWERER_ERKRANKUNG = "Leistung bei schwerer Erkrankung";
    public static final String VERSICHERTE_ERKRANKUNGEN = "Versicherte Erkrankungen";
    public static final String LEISTUNGSBEGINN_AB = "Leistungsbeginn ab";
    public static final String JAHRESRENTE_IN_WAEHRUNGSEINHEITEN2 = "Jahresrente";
    public static final String KAPITALZAHLUNGSSUMME_IN_WAEHRUNGSEINHEITEN2 = "Kapitalzahlungssumme";
    public static final String TEILKAPITALISIERUNG = "Teilkapitalisierung";
    public static final String TODESFALLLEISTUNG_IN_WAEHRUNGSEINHEITEN = "Todesfallleistung";
    public static final String EINGERECHNETE_ZULAGE = "Eingerechnete Zulage";
    public static final String EINRECHNUNGSJAHR = "Einrechnungsjahr";
    public static final String TEILDATENSATZNUMMER = "Teildatensatznummer";

    // Haftpflicht
    public static final String KENNZEICHEN_FUER_ABWEICHENDE_ABSCHLUSSPROVISION = "Kennzeichen fuer abweichende Abschlussprovision";
    public static final String KENNZEICHEN_FUER_ABWEICHENDE_FOLGEPROVISION = "Kennzeichen fuer abweichende Folgeprovision";
    public static final String RESTLAUFZEIT_DES_VERTRAGES = "Restlaufzeit des Vertrages";
    public static final String SELBSTBEHALT = "Selbstbehalt";
    public static final String WAEHRUNGSSCHLUESSEL_1 = "Waehrungsschluessel 1";
    public static final String WAEHRUNGSSCHLUESSEL_2 = "Waehrungsschluessel 2";
    public static final String WAEHRUNGSSCHLUESSEL_3 = "Waehrungsschluessel 3";
    public static final String WAEHRUNGSSCHLUESSEL_4 = "Waehrungsschluessel 4";
    public static final String BEITRAG_JE_BERECHNUNGSEINHEIT_UND_MENGENSCHLUESSEL = "Beitrag je Berechnungseinheit und Mengenschluessel";
    public static final String BERECHNUNGSEINHEIT = "Berechnungseinheit";
    public static final String DECKUNGSSUMME_1_IN_TAUSEND_WAEHRUNGSEINHEITEN = "Deckungssumme 1 in Tausend";
    public static final String DECKUNGSSUMME_2_IN_TAUSEND_WAEHRUNGSEINHEITEN = "Deckungssumme 2 in Tausend";
    public static final String DECKUNGSSUMME_3_IN_TAUSEND_WAEHRUNGSEINHEITEN = "Deckungssumme 3 in Tausend";
    public static final String DECKUNGSSUMME_4_IN_TAUSEND_WAEHRUNGSEINHEITEN = "Deckungssumme 4 in Tausend";
    public static final String ERHOEHUNGSSATZ_8_III_AHB = "Erhoehungssatz \u00a78, III AHB";
    public static final String KENNUNG_ERHOEHUNGSSATZ = "Kennung Erhoehungssatz";
    public static final String KENNZEICHEN_FUER_JAHRES_MAXIMIERUNG = "Kennzeichen fuer Jahres-Maximierung";
    public static final String LETZTE_ERHOEHUNG_8_III_AHB = "Letzte Erhoehung \u00a78, III AHB";
    public static final String MENGENSCHLUESSEL = "Mengenschluessel";
    public static final String MINDESTBEITRAG_JE_WAGNIS_IN_WAEHRUNGSEINHEITEN = "Mindestbeitrag je Wagnis";
    public static final String ORDNUNGS_NUMMER_FUER_WAGNISZUSATZ2 = "Ordungs-Nummer fuer Wagniszusatz";
    public static final String POSTLEITZAHL_DER_RISIKOANSCHRIFT = "Postleitzahl der Risikoanschrift";
    public static final String RISIKOORT = "Risikoort";
    public static final String RISIKOSTRASSE = "Risikostrasse";
    public static final String SUMMENART_1 = "Summenart 1";
    public static final String SUMMENART_2 = "Summenart 2";
    public static final String SUMMENART_3 = "Summenart 3";
    public static final String SUMMENART_4 = "Summenart 4";
    public static final String WAGNISBESCHREIBUNG = "Wagnisbeschreibung";
    public static final String WAGNISMENGE = "Wagnismenge";
    public static final String WAGNISTEXT = "Wagnistext";
    public static final String DECKUNGSSUMME_1_IN_WAEHRUNGSEINHEITEN = "Deckungssumme 1";
    public static final String DECKUNGSSUMME_2_IN_WAEHRUNGSEINHEITEN = "Deckungssumme 2";
    public static final String DECKUNGSSUMME_3_IN_WAEHRUNGSEINHEITEN = "Deckungssumme 3";
    public static final String DECKUNGSSUMME_4_IN_WAEHRUNGSEINHEITEN = "Deckungssumme 4";
    public static final String ORDNUNGS_NUMMER_FUER_WAGNISZUATZ = "Ordungs-Nummer fuer Wagniszusatz";

    // Unfall
    public static final String REFERENZ_VERSICHERUNGSSCHEINNUMME = "Referenz-Versicherungsscheinnumme";
    public static final String DAUERSCHAEDEN_KOERPERLICHE_BEEINTRAECHTIGUNGEN = "Dauerschaeden / koerperliche Beeintraechtigungen";
    public static final String ERKRANKUNGEN = "Erkrankungen";
    public static final String UNFAELLE = "Unfaelle";
    public static final String ART_DER_AUSZAHLUNG = "Art der Auszahlung";
    public static final String ART_DER_LEISTUNG = "Art der Leistung";
    public static final String ART_DES_BEITRAGSSATZES = "Art des Beitragssatzes";
    public static final String BEGINN_DER_ZAHLUNG_AB_TAG = "Beginn der Zahlung ab Tag";
    public static final String BEITRAG = "Beitrag";
    public static final String BEITRAGSSATZ = "Beitragssatz";
    public static final String BEZEICHNUNG_DER_LEISTUNG = "Bezeichnung der Leistung";
    public static final String LEISTUNG = "Leistung";
    public static final String LEISTUNG_AB_INVALIDITAETSGRAD_IN_PROZENT = "Leistung ab Invaliditaetsgrad in Prozent";
    public static final String LEISTUNGSZAHLUNGSWEISE = "Leistungszahlungsweise";
    public static final String LFD_NUMMER_ZUR_ART_DER_LEISTUNG = "Laufende Nummer zur Art der Leistung";
    public static final String PROZENTSATZ_PROGRESSIVE_INVALIDITAET_MEHRLEISTUNG_BEI_INVALIDITAET = "Prozentsatz progressive Invaliditaet / Mehrleistung bei Invaliditaet";

    // Verbundene Hausrat
    public static final String INTRO1 = "Intro";
    public static final String LAENDERKENNZEICHEN_DER_RISIKOANSCHRIFT = "Laenderkennzeichen der Risikoanschrift";
    public static final String WAEHRUNGSSCHUESSEL = "Waehrungsschluessel";
    public static final String ABSCHLAGSBEITRAG_IN_WAEHRUNGSEINHEITEN = "Abschlagsbeitrag";
    public static final String GESAMTVERSICHERUNGSSUMME_IN_WAEHRUNGSEINHEITEN = "Gesamtversicherungssummer";
    public static final String BEDINGUNGEN = "Bedingungen";
    public static final String ERWEITERTE_NEUWERTVERSICHERUNG = "erweiterte Neuwertversicherung";
    public static final String SICHERUNGSRICHTLINIEN = "Sicherungsrichtlinien";
    public static final String EINBRUCH_MELDEANLAGE = "Einbruch Meldeanlage";
    public static final String RISIKOKENNZIFFER = "Risikokennziffer";
    public static final String ANZAHL_MONATE_UNBEWOHNT = "Anzahl Monate unbewohnt";
    public static final String WOHNFLAECHE_QM = "Wohnflaeche qm";
    public static final String TARIFZONE = "Tarifzone";
    public static final String BAUARTKLASSE = "Bauartklasse";
    public static final String GEFAHRENERHOEHUNG = "Gefahrenerhoehung";
    public static final String EINSCHLUSS_VANDALISMUS = "Einschluss Vandalismus";
    public static final String UNTERVERS_VERZICHT = "Untervers.-Verzicht";
    public static final String OBJEKTNUMMER2 = "Objektnummer";
    public static final String BUENDELUNSKENNZEICHEN = "Buendelungskennzeichen";
    public static final String GESCHAEFTSSTELLE_VERMITTLER = "Geschaeftsstelle / Vermittler";
    public static final String STAENDIG_BEWOHNT = "Staendig bewohnt";
    public static final String OBJEKTNUMMER = "Objektnummer";

    private static final Logger LOG = LogManager.getLogger(Bezeichner.class);

    private static final Map<String, String> MAPPING = new HashMap<String, String>();

    private final String name;
    private final String technischerName;
    private final int hash;

    // Mapping fuer manche Bezeichner (Name <--> technischer Name)
    static {
        MAPPING.put(LFD_PERSONENNR_GEVO, "LfdPersonenNrImGevo");
        MAPPING.put(VERSICHERUNGSSCHEINNUMMER, "VsNr");
        MAPPING.put(VU_NUMMER, "VuNr");
    }

    /**
     * Legt einen neuen Bezeichner mit dem gewuenschten Name an.
     *
     * @param name der gewuenschte Name
     * @since 1.0
     */
    public Bezeichner(final String name) {
        this(name, toTechnischerName(name));
    }

    /**
     * Legt einen neuen Bezeichner mit dem gewuenschten Werten an.
     * Die Werte muessen in der uebergebenen Property unter dem Key "name"
     * und "technischerName" vorliegen.
     *
     * @param props Properties mit Name und technischer Name
     */
    public Bezeichner(final Properties props) {
        this(props.getProperty("name", ""), props.getProperty("technischerName", ""));
    }

    /**
     * Legt einen neuen Bezeichner mit dem gewuenschten Name an.
     *
     * @param name der gewuenschte Name
     * @param technischerName der entsprechende technische Name
     * @since 1.0
     */
    public Bezeichner(final String name, final String technischerName) {
        this.name = name;
        this.technischerName = StringUtils.isEmpty(technischerName) ? toTechnischerName(name) : technischerName;
        this.hash = this.technischerName.toUpperCase().hashCode();
    }

    private static String toTechnischerName(final String input) {
        String techName = MAPPING.get(input);
        if (techName != null) {
            return techName;
        }
        StringBuilder converted = new StringBuilder();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '\u00c4':
                    converted.append("Ae");
                    break;
                case '\u00d6':
                    converted.append("Oe");
                    break;
                case '\u00dc':
                    converted.append("Ue");
                    break;
                case '\u00e4':
                    converted.append("ae");
                    break;
                case '\u00f6':
                    converted.append("oe");
                    break;
                case '\u00fc':
                    converted.append("ue");
                    break;
                case '\u00df':
                    converted.append("ss");
                    break;
                default:
                    if (Character.isLetterOrDigit(chars[i])) {
                        converted.append(chars[i]);
                    }
                    break;
            }
        }
        return converted.toString();
    }

    /**
     * Liefert den Namen des Bezeichners.
     *
     * @return der Name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Der technische Name leitet sich aus dem normalen Namen ab. Im
     * Gegensatz zum normalen Namen enthaelt er aber keine Leerzeichen,
     * Sonderzeichen oder Umlaute.
     * <p>
     * Der technische Name wird auch dazu verwendet, um zwei {@link Bezeichner}
     * auf Gleichheit zu testen.
     * </p>
     *
     * @return der technische Name
     */
    public String getTechnischerName() {
        return this.technischerName;
    }

    /**
     * Zum Vergleich zweier {@link Bezeichner} wird zuerst der Name und dann der
     * technische Name herangezogen.
     *
     * @param obj der andere Bezeichner
     * @return true, wenn er als gleich angesehen wird
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof Bezeichner)) {
            return false;
        }
        Bezeichner other = (Bezeichner) obj;
        return this.getTechnischerName().equalsIgnoreCase(other.getTechnischerName());
    }

    /**
     * Der Hash-Code wird aus dem technischen Namen abgeleitet.
     * <p>
     * Aus Performance-Gruenden wird der hash einmal beim Anlegen ermittelt,
     * da der Bezeichner intern fuer diverse HashMaps verwendet wird.
     * </p>
     *
     * @return den berechneten Hash-Code
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return this.hash;
    }

    /**
     * Da der Bezeichner als Ersatz fuer die String-Klasse eingesetzt werden soll,
     * liefern wir den Namen hier zurueck.
     *
     * @return den Namen
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        if (this.technischerName.length() > 5) {
            return this.technischerName;
        } else  {
            return this.technischerName + " (" + this.name + ")";
        }
    }

    /**
     * Hierueber liefern wird die Konstante mit dem uebergebenen Text als
     * Feld zurueck.
     *
     * @param bezeichnung Text der gesuchten Konstanten
     * @return die entsprechende Konstante
     * @since 1.0
     */
    public static Field getField(final String bezeichnung) {
        Field[] fields = Bezeichner.class.getFields();
        for (int i = 0; i < fields.length; i++) {
            try {
                Object value = fields[i].get(null);
                if ((value != null) && bezeichnung.equalsIgnoreCase(value.toString())) {
                    return fields[i];
                }
            } catch (IllegalAccessException e) {
                if (LOG.isDebugEnabled()) {
                    LOG.debug("Will ignore field " + fields[i] + ": ", e);
                }
            }
        }
        throw new IllegalArgumentException("no constant with text \"" + bezeichnung + "\" defined");
    }

    /**
     * Verwendet den uebergebenen Bezeichner, um den technischen Namen zu
     * aktualisieren.
     *
     * @param bezeichner the bezeichner
     * @return the bezeichner
     */
    public Bezeichner mergeWith(final Bezeichner bezeichner) {
        if (this.technischerName.equals(toTechnischerName(this.name))) {
            return new Bezeichner(this.name, bezeichner.getTechnischerName());
        } else {
            LOG.info("Merge of {} and {} is ignored.", this, bezeichner);
            return this;
        }
    }

}
