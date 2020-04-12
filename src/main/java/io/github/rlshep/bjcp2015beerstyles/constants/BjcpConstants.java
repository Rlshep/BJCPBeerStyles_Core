package io.github.rlshep.bjcp2015beerstyles.constants;

import java.util.Arrays;
import java.util.List;

public class BjcpConstants {
    public static final String DATABASE_NAME = "BjcpBeerStyles.db";
    public static final int DATABASE_VERSION = 17;   // Make sure LoadBjcp project picks up this change for PRAGMA header
    public static final int MAX_SEARCH_CHARS = 3;
    public static final String DEFAULT_LANGUAGE = "en";
    public static final String DEFAULT_COUNTRY = "US";
    public static final String SPANISH_HYBRID = "es_en";
    public static final String SPANISH = "es";
    public static final String UKRANIAN = "uk";
    public static final String[] ALLOWED_LANGUAGES = {"en", "es", "es_en", "uk"};
    public static final List allowedLanguages = Arrays.asList(ALLOWED_LANGUAGES);
}
