package diamond;

public class Diamond {
    
    public static String printDiamond(String string) {
        char buildingLetter = string.toUpperCase().charAt(string.length() - 1);
        StringBuilder diamond = new StringBuilder();
        for (int i = buildingLetter - 'A'; i >= 0; i--) {
            buildDiamondLine(buildingLetter, diamond, i);
        }
        for (int i = 1; i < buildingLetter - 'A'; i++) {
            buildDiamondLine(buildingLetter, diamond, i);
        }
        addSpace(diamond, buildingLetter - 'A');
        diamond.append('A');
        return diamond.toString();
    }

    private static void buildDiamondLine(char buildingLetter, StringBuilder sb, int i) {
        addSpace(sb, i).append((char) (buildingLetter - i));
        if (buildingLetter - 'A' - i > 0) {
            addSpace(sb, (buildingLetter - 'A' - i) * 2 - 1).append((char) (buildingLetter - i));
        }
        sb.append("\n");
    }

    private static StringBuilder addSpace(StringBuilder sb, int space) {
        for (int i = 0; i < space; i++) {
            sb.append(" ");
        }
        return sb;
    }
}
