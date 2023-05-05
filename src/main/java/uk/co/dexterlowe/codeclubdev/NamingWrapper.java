package uk.co.dexterlowe.codeclubdev;

public record NamingWrapper(String baseName) {
    public static final String BLOCK_SUFFIX = "_block";
    public static final String ORE_SUFFIX = "_ore";
    public static final String RAW_PREFIX = "raw_";
    public static final String DEEPSLATE_PREFIX = "deepslate_";

    public String getOreName() {
        return baseName + ORE_SUFFIX;
    }

    public String getBlockName() {
        return baseName + BLOCK_SUFFIX;
    }

    public String getRawName() {
        return RAW_PREFIX + baseName;
    }

    public String getDeepSlateOreName() {
        return DEEPSLATE_PREFIX + getOreName();
    }
}
