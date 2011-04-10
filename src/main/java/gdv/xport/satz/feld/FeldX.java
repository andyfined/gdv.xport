/*
 * Copyright (c) 2011 by agentes
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
 * (c)reated 07.04.2011 by Oli B. (oliver.boehm@agentes.de)
 */

package gdv.xport.satz.feld;

import gdv.xport.annotation.FeldInfo;
import gdv.xport.feld.*;

/**
 * Diese Enum-Klasse ist nur ein Platzhalter fuer eine unbekannte oder noch
 * nicht unterstuetzte Satzart.
 * 
 * @author oliver (oliver.boehm@agentes.de)
 * @since 0.6 (07.04.2011)
 */
public enum FeldX {
    
    /////   Teildatensatz 1   /////////////////////////////////////////////////

    /**
     * Nur ein Platzhalter fuer den gesamten unbekannten Rest eines
     * Teildatensatzes.
     */
    @FeldInfo(
            teildatensatz = 1,
            nr = 8,
            type = AlphaNumFeld.class,
            anzahlBytes = 213,
            byteAdresse = 43
    )
    UNBEKANNT;

}
