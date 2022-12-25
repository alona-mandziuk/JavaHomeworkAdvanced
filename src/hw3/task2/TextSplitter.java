package hw3.task2;

class TextSplitter {
    public static void main(String[] args) {
        String string1 = "The Asgardian Loki encounters the Other, " +
                "the leader of an extraterrestrial race known as the Chitauri. " +
                "In exchange for retrieving the Tesseract, a powerful energy source of unknown potential, " +
                "the Other promises Loki an army with which he can subjugate Earth. " +
                "Nick Fury, director of the espionage agency SHIELD, " +
                "arrives at a remote research facility, where physicist Dr Erik Selvig " +
                "is leading a team experimenting on the Tesseract.";
        String string2 = string1.substring(0, string1.length() / 2);
        String string3 = string1.substring(string1.length() / 2);

        System.out.println("------------------------------------------");
        String[] array2 = string2.split("\\.");
        for (String ar2 : array2) {
            System.out.println(ar2);
        }
        System.out.println("------------------------------------------");
        String[] array3 = string3.split("\\.");
        for (String ar3 : array3) {
            System.out.println(ar3);
        }
        System.out.println("------------------------------------------");

    }
}
