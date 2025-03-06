package level_1_practice_programs;

class ModulusDivisionOperators {
    public static void main(String[] args) {

        int totalPens = 14;
        int students = 3;
        int penPerStudent = (int) (totalPens / students);
        int remPen = 14 % 3;

        System.out.println(
                "The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remPen);
        ;
    }
}
