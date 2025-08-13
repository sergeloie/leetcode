package strings;

public class LicenseKeyFormatting_482 {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder(s.replaceAll("-", "").toUpperCase());
        int size = sb.length() - 1;
        int count = size / k;
        for (int i = 1; i <= count; i++) {
            sb.insert(size - i * k + 1, "-");
        }
        return sb.toString();
    }
}
