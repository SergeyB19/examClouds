package task22;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = createSomeString(3, 56);
        StringBuilder stringBuilder2 = createSomeString(30, 2);

        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);

        modifySomeString(stringBuilder1,"=","равно ");
        modifySomeString(stringBuilder1,"+","плюс ");
        System.out.println(stringBuilder1);
    }

    private static StringBuilder createSomeString(int a, int b) {
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n")
                .append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n")
                .append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        return result;
    }

    private static StringBuilder modifySomeString(StringBuilder stringBuilder,String oldString, String newString) {
        int pos;
        while ((pos = stringBuilder.indexOf(oldString)) != -1) {
            stringBuilder.deleteCharAt(pos);
//            stringBuilder.insert(pos, " равно");
            stringBuilder.replace(pos, pos + 1, newString);
        }
        return stringBuilder;
    }

}
