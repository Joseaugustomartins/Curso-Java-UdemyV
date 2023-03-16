package ExerciciosSobreMemoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ClasseExMemoria.Employee;

public class ExFixa1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		//PARTE 1
		
		System.out.print("Quantos funcionários serão cadastrados? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Funcionário #" + i + ": ");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id ja adcionado. Tente novamente");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}
		
		//PARTE 2
		
		
		System.out.println();
		System.out.print("Informe o id do funcionário que terá aumento salarial: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("O id não existe! ");
		}
		else {
			System.out.print("Digite a porcentagem: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		//PARTE 3
		
		System.out.println();
		System.out.println("Lista de funcionários: ");
		for (Employee obj : list) {
			System.out.println(obj);
		}
		
		
		sc.close();
		
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
