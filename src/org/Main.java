package org;

public class Main {
    public static void main(String[] args) {
        String coder_text = "ЗТЕФТИ ЧЦФТ!\n" +
                "ЙЛЗ Б ЗЦИЭ Й ГЖКДЭКГШЕБ Ъ НЖДЖЬБДФЁБГЭ.\n" +
                "БЪВАШЬЪ УГЦ ЯЦ ЦЙН УЦИЦВАЮ БВЪХЕД ФАГДЪ.\n" +
                "ЗЛКСВПЗЁ Н ЁЫНЫДТЫ А ЩЛБХШЙЛЁ ХЗИПДН ТПНЙЗ ЫЮРЮЙЗЁ СТРДЖТА. ПГПГ.";
        System.out.println("Исходный текст:\n");
        System.out.println(coder_text + "\n");
        Decoder dc = new Decoder();
        String decoder_text = dc.decode(coder_text);
        System.out.println("Перевод первых двух строк:\n");
        System.out.println(decoder_text);

        System.out.println("Перевод 3-й строки:\n");
        String[] text = coder_text.split("\n");

        for (int i = 1; i < 32; i++) {
            System.out.println(i + ") Возможен такой перевод: " + dc.string_1_2(i, text[2]));
        }
        System.out.println("\nПеревод 4-й строки:\n");
        String[] words = text[3].split(" ");
        for (int j = 0; j < words.length; j++) {
            System.out.println("Возможен " + (j + 1) + " слово 4-й строки:");
            for (int i = 1; i <= 33; i++) {
                System.out.print(i + ") " + dc.string_1_2(i, words[j]) + "\n");
            }
        }
    }
}
