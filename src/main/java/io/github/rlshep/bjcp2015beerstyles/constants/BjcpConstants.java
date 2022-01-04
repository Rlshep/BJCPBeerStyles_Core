package io.github.rlshep.bjcp2015beerstyles.constants;

import java.util.*;

public class BjcpConstants {
    public static final String DATABASE_NAME = "BjcpBeerStyles.db";
    public static final int DATABASE_VERSION = 21;   // Make sure LoadBjcp project picks up this change for PRAGMA header
    public static final int MAX_SEARCH_CHARS = 3;
    public static final String DEFAULT_LANGUAGE = "en";
    public static final String DEFAULT_COUNTRY = "US";
    public static final String ENGLISH = "en";
    public static final String SPANISH = "es";
    public static final String UKRANIAN = "uk";
    public static final String[] ALLOWED_LANGUAGES = {"en", "es", "es_en", "uk"};
    public static final List allowedLanguages = Arrays.asList(ALLOWED_LANGUAGES);
    public static final String BJCP_2015 = "BJCP_2015";
    public static final String BJCP_2021 = "BJCP_2021";
    public static final String BA_2021 = "BA_2021";
    public static final Map<String, String> GUIDELINE_MAP = new HashMap<String, String>() {{
        put("2021 BA", BA_2021);
        put("2015 BJCP", BJCP_2015);
        put("2021 BJCP", BJCP_2021);
    }};
    public static final String ZERO = "0";

    public static String getStyleTypeKeyValue(String value) {
        for (Map.Entry<String, String> entry : GUIDELINE_MAP.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return "";
    }
}
