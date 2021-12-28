class implement_array_of_object {

    public static void main(String args[])
    {

        Student[] arr;

        arr = new Student[2];

        arr[0] = new Student(1701289270, "krishna");

        arr[1] = new Student(1701289219, "gpi");

        System.out.println(
            "Student data in student arr 0: ");
        arr[0].display();

        System.out.println(
            "Student data in student arr 1: ");
        arr[1].display();
    }
}
