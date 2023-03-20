public class ArrEmployee {
    private final Employee[] persons;
    private int size;

    public ArrEmployee() {
        this.persons = new Employee[10];
        // Задали массиву Contact длину — 10
    }


    // Реализуем метод add (создать сотрудника):

    public void addEmployer(String fullName, int departament, int sallary) {

        if (size >= persons.length) {
            System.out.println("Нельзя добавить контакт, закончилось место");
        }
        Employee newContact = new Employee(fullName, departament, sallary);
        persons[size++] = newContact;
    }



    // Реализуем метод printAllEmployer (распечатать всех сотрудников)
    public void printAllEmployer() {
        for (int i = 0; i < size; i++) {
            Employee newPerson = persons[i];
            System.out.println(newPerson.toString());
        }
    }

    public void printFullName() {
        for (int i = 0; i < size; i++) {
            Employee fullName = persons[i];
            System.out.println(fullName.getFullName());
        }
    }

    public int calculateSumSallary(){
        int sum = 0;
        for (int i = 0; i < size; i++) {
            Employee sumCal = persons[i];
            sum += sumCal.getSallary();
        }
        return sum;
    }

    public int minSallary(){
        int sallary = 1_000_000;
        for (int i = 0; i < size; i++) {
            Employee sallaryMin = persons[i];
            if (sallary > sallaryMin.getSallary()) {
                sallary = sallaryMin.getSallary();
            }
        }
        return sallary;
    }

    public int maxSallary(){
        int sallary = 0;
        for (int i = 0; i < size; i++) {
            Employee sallaryMin = persons[i];
            if (sallary < sallaryMin.getSallary()) {
                sallary = sallaryMin.getSallary();
            }
        }
        return sallary;
    }

    public int calculateAvgSallary(){
        int sum = 0;
        int i = 0;
        for (; i < size; i++) {
            Employee sumCal = persons[i];
            sum += sumCal.getSallary();
        }
        return sum / i;
    }

    public void changeSallaryPerson(int id, int changeSallary){
        for (int i = 0; i < size; i++) {
            if (persons[i].getId() == id) {
                persons[i].setSallary(changeSallary);
                break;
            }
        }
    }

    public void changeDepartamentPerson(int id, int changeDepartament){
        for (int i = 0; i < size; i++) {
            if (persons[i].getId() == id) {
                persons[i].setDepartament(changeDepartament);
                break;
            }
        }
    }
    public void changeSallaryIndex(int procent){
        double procentCal = (double) procent / 100;
        for (int i = 0; i < size; i++) {
            int newSallary = (int)((double)persons[i].getSallary() * procentCal);
            persons[i].setSallary(newSallary + persons[i].getSallary());
        }
    }
    public void minSallaryDepartament(int departament){
        int minSallary = 1_000_000;
        for (int i = 0; i < size; i++) {
            if(persons[i] != null){
                if (persons[i].getDepartament() == departament) {
                    if (minSallary > persons[i].getSallary()) {
                        minSallary = persons[i].getSallary();
                    }
                }
            }
        }
        System.out.println("Минимальная зарплата в " + departament + " отделе " + minSallary);
    }

    public void maxSallaryDepartament(int departament){
        int maxSallary = 0;
        for (int i = 0; i < size; i++) {
            if (persons[i] != null) {
                if (persons[i].getDepartament() == departament) {
                    if (maxSallary < persons[i].getSallary()) {
                        maxSallary = persons[i].getSallary();
                    }
                }
            }
        }
        System.out.println("Максимальная зарплата в " + departament + " отделе " + maxSallary);
    }


    public void sumSallaryDepartament(int departament) {
        int sumSallary = 0;

        for (int i = 0; i < size; i++) {
            if (persons[i].getDepartament() == departament) {
                sumSallary += persons[i].getSallary();
            }
        }
        System.out.println("Сумму затрат на зарплату по " + departament + " отделу: " + sumSallary);
    }
    public void avgSallaryDepartament(int departament) {
        int sumSallary = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (persons[i].getDepartament() == departament) {
                sumSallary += persons[i].getSallary();
                count++;
            }
        }
        System.out.println("Средняя зарплата в " + departament + " отделе " + (sumSallary / count));
    }
    public void changeSallaryIndexDepartament(int departament, int procent){
        double procentCal = (double) procent / 100;
        for (int i = 0; i < size; i++) {
            if (persons[i].getDepartament() == departament) {
                int newSallary = (int)((double)persons[i].getSallary() * procentCal);
                persons[i].setSallary(newSallary + persons[i].getSallary());
            }
        }
    }

    public void printInfoDepartament(int departament){
        for (int i = 0; i < size; i++) {
            if (persons[i].getDepartament() == departament){
                System.out.println("Имя : " + persons[i].getFullName() +
                        "\nЗарплата: " + persons[i].getSallary() +
                        "\nID: " + persons[i].getId());
            }
        }
    }

    public void printMinSallaryOfNum(int minNum){
        for (int i = 0; i < size; i++) {
            if (persons[i].getSallary() < minNum){
                System.out.println("Имя : " + persons[i].getFullName() +
                        "\nЗарплата: " + persons[i].getSallary() +
                        "\nID: " + persons[i].getId());
            }

        }
    }

    public void printMaxSallaryOfNum(int maxNum){
        for (int i = 0; i < size; i++) {
            if (persons[i].getSallary() > maxNum){
                System.out.println("Имя : " + persons[i].getFullName() +
                        "\nЗарплата: " + persons[i].getSallary() +
                        "\nID: " + persons[i].getId());
            }

        }
    }
}

