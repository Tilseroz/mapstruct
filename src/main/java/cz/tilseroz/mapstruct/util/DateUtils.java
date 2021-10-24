package cz.tilseroz.mapstruct.util;

import lombok.experimental.UtilityClass;

/**
 * Pokud máme UtilityClass od Lomboku, tak Lombok automaticky vygeneruje private konstruktor, kterej vyhazuje exception.
 * Dále nám všechny metody i fieldy udělá static. Class nám dá FINAL.
 */
@UtilityClass
public class DateUtils {

        private final String CONSTANT = "this is constant";

        public int retrieveLength(String value) {
            return value.length();
        }

}
