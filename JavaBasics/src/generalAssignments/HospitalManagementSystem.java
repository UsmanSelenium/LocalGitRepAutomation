package generalAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalManagementSystem {

	public static void main(String[] args) {
		
		Doctor dr1 = new Doctor("Dr Sharma", "Cardiologist", "Appolo Hospital", 500);
		Doctor dr2 = new Doctor("Dr Mehta", "Neurologist", "Fortis Hospital", 700);
		Doctor dr3 = new Doctor("Dr Kapoor", "Orthopedic", "Max Hospital", 600);
		Doctor dr4 = new Doctor("Dr Sinha", "Dermatologist", "AIIMS Hospital", 400);
		
		List<Doctor> l1 = new ArrayList<Doctor>();
		l1.add(dr1);
		l1.add(dr2);
		l1.add(dr3);
		l1.add(dr4);
		
		
		Scanner sc = new Scanner(System.in);
		
		boolean option = true;
		
		do {
			System.out.println("Doctor Details ");
			System.out.println("1. Doctor Name");
			System.out.println("2. Display All Doctor Details");
			System.out.println("3. Exit");
			System.out.println("Please enter your choice from 1 to 3");
			
			int input = sc.nextInt();
			
			if(input==1) {
				System.out.println("Doctor Name");
				String drName = sc.next();
				
		for(Doctor values: l1) {
			String docName = values.getName();
			if(docName.contains(drName)) {
				System.out.println(values.getName() + " "+values.getSpecilization()+ " "+values.getHospitalName()+" "+values.charges);
			}
		}					
			}
			if(input ==2) {
				
				for(Doctor values: l1) {
					System.out.println(values.getName() + " "+values.getSpecilization()+ " "+values.getHospitalName()+" "+values.charges);
				}
			}
			if(input == 3) {
				System.out.println("Exit.......");	
				option=false;
			}
			
			
		} while(option);		
		}
	}

