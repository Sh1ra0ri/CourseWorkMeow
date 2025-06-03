class Main {
    private static Employee[] staff = new Employee[10];

    public static void main(String[] args) {
        staff[0] = new Employee("Смирнов Алексей Сергеевич", 2, 55000);
        staff[1] = new Employee("Кузнецова Мария Ивановна", 4, 70000);
        staff[2] = new Employee("Васильев Дмитрий Петрович", 1, 48000);

        showAllStaff();
        System.out.println("Сумма затрат на ЗП: " + sumSalaries());
        System.out.println("Сотрудник с минимальной ЗП: " + findMinSalary());
        System.out.println("Сотрудник с максимальной ЗП: " + findMaxSalary());
        System.out.println("Средняя ЗП: " + avgSalary());
        showAllNames();
    }

    public static void showAllStaff() {
        for (Employee emp : staff) {
            if (emp != null) {
                System.out.println(emp.getDetails());
            }
        }
    }

    public static double sumSalaries() {
        double sum = 0;
        for (Employee emp : staff) {
            if (emp != null) {
                sum += emp.getSalary();
            }
        }
        return sum;
    }

    public static Employee findMinSalary() {
        Employee minEmp = null;
        double min = Double.MAX_VALUE;
        for (Employee emp : staff) {
            if (emp != null && emp.getSalary() < min) {
                min = emp.getSalary();
                minEmp = emp;
            }
        }
        return minEmp;
    }

    public static Employee findMaxSalary() {
        Employee maxEmp = null;
        double max = Double.MIN_VALUE;
        for (Employee emp : staff) {
            if (emp != null && emp.getSalary() > max) {
                max = emp.getSalary();
                maxEmp = emp;
            }
        }
        return maxEmp;
    }

    public static double avgSalary() {
        double sum = 0;
        int count = 0;
        for (Employee emp : staff) {
            if (emp != null) {
                sum += emp.getSalary();
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }

    public static void showAllNames() {
        for (Employee emp : staff) {
            if (emp != null) {
                System.out.println(emp.getFio());
            }
        }
    }
}