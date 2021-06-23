package org;

public class Decoder {
    private String a = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public String decode(String coder_text) {
        String[] text = coder_text.split("\n");

        return this.string_1_2(-4, text[0]) + "\n"
                + this.string_1_2(8, text[1]) + "\n";
    }

    public String string_1_2(int s, String str){
        String[] symbols = str.split("");
        StringBuilder de_str = new StringBuilder();
        for (String symbol : symbols) {
            if (this.a.contains(symbol)) {
                int p = s + this.a.indexOf(symbol);
                if (p > 32) p = p - 33;
                if (p < 0) p = p + 33;
                de_str.append(this.a.charAt(p));
            }
            else de_str.append(symbol);
        }
        return de_str.toString();
    }
}
