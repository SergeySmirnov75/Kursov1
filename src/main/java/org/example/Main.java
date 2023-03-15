public class Main
{
    public static void main(String[] args) {
        ArrEmployee arrEmployee = new ArrEmployee();

        arrEmployee.addEmployer("Смирнов Сергей Николаевич", 1, 95000);
        arrEmployee.addEmployer("Киселёв Иван Киприянович", 1, 87000);
        arrEmployee.addEmployer("Ушаков Павел Владимирович", 1, 89000);
        arrEmployee.addEmployer("Максимов Александр Юрьевич", 2, 89000);
        arrEmployee.addEmployer("Калинин Виталий Владимирович", 3, 110000);
        arrEmployee.addEmployer("Заика Андрей Олегович", 3, 67000);
        arrEmployee.addEmployer("Завалин Александр Сергеевич", 4, 250000);
        arrEmployee.addEmployer("Патерюхин Артём Алексеевич", 2, 90000);


        arrEmployee.printFullName();

        System.out.println();

        System.out.println("Общая трата на зарплаты " + arrEmployee.calculateSumSallary());

        System.out.println();

        System.out.println("Минимальная зарплата " + arrEmployee.minSallary());

        System.out.println();

        System.out.println("Максимальная зарплата " + arrEmployee.maxSallary());

        System.out.println();

        System.out.println("Средняя зарплата " + arrEmployee.calculateAvgSallary());

        System.out.println();

        arrEmployee.printAllEmployer();

        System.out.println();

        arrEmployee.changeSallaryPerson(0, 190000);

        System.out.println();

        arrEmployee.changeDepartamentPerson(0, 3);

        System.out.println();

        arrEmployee.changeSallaryIndex(10);

        System.out.println();

        arrEmployee.printAllEmployer();

        System.out.println();

        arrEmployee.minSallaryDepartament(4);

        System.out.println();

        arrEmployee.maxSallaryDepartament(4);

        System.out.println();

        arrEmployee.sumSallaryDepartament(4);

        System.out.println();

        arrEmployee.avgSallaryDepartament(4);

        System.out.println();

        arrEmployee.changeSallaryIndexDepartament(4, 15);

        System.out.println();

        arrEmployee.printInfoDepartament(4);

        System.out.println();

        arrEmployee.printMinSallaryOfNum(100000);

        System.out.println();

        arrEmployee.printMaxSallaryOfNum(100000);


    }
}
