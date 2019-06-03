

public class Sistaforsoket {

	static void Sort(int[] arr) {
		int b = arr.length;  // kollar l�ngden p� arrayen
		int temp = 0; //tempor�r integer
		for (int i = 0; i < b; i++) { // I �r 0 men s� l�nge den �r mindre �n arrayen s� blir det plus 1
			for (int j = 1; j < (b - i); j++) { // N�r j �r st�rre �n l�ngden minus i fr�n f�rra raden
				if (arr[j - 1] > arr[j]) { // n�r j blir mindre �n j - 1
					temp = arr[j - 1]; // s� f�r temp v�rdet arr[j-1]
					arr[j - 1] = arr[j];// d� flyttar vi om s� att arr[j] �r arr[j-1]
					arr[j] = temp;//skriver sedan att temp �r arr[j]  
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a;
		a = new int[100];

		for (int m = 0; m < 100; m++) {
			a[m] = (int) (Math.random() * 1000);
		}
		Sort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
