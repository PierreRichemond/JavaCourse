public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            LPAStudent s = new LPAStudent("index" + i,
                    switch(i){
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Henri";
                case 4 -> "Bob";
                case 5 -> "Martin";
                default  -> "Anonymous";
                    },
                    "05/05/1990",
                    "Java Masterclass"
                    );
            System.out.println(s);
        }

        LPAStudent lpaStudent = new LPAStudent("6",
                "Ann",
                "05/05/1990",
                "Java Masterclass"
        );
        lpaStudent.name(); // Ann is immutable cant change the value
        System.out.println(lpaStudent);
        Student pojoStudent = new Student("7",
                "Cathrine",
                "05/05/1990",
                "Java Masterclass"
        );
        pojoStudent.setName("Joe");  // name = joe

        System.out.println(pojoStudent);
    }
}