import java.util.Scanner;

class Queue {

	int front;
	int rear;
	String[] arr;

	Queue() {
		front = rear = -1;
		// tamño por defecto de 10
		arr = new String[100];
	}

	void enqueue(String a) {
		if (rear == arr.length - 1)
			System.out.println("overflow");
		else
			arr[++rear] = a;

		if (front == -1)
			front++;
	}

	String dequeue() {
		String x = " ";
		if (front == -1)
			System.out.println("underflow");
		else
			x = arr[front++];
		if (rear == 0)
			rear--;
		return x;
	}

	void display() {
		for (int i = front; i <= rear; i++)
			System.out.print(arr[i] + " ");

		System.out.println();

	}
}


public class Problema1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		Queue ob = new Queue();

		System.out.print("\nIngrese el numero que desea transformar a binario e ingresarlo en la cola: ");
		numero = sc.nextInt(); 

		System.out.println("\n--Ingresando a la cola--");
		for (int i = 0; i < numero + 1; i++){
			String bin = Integer.toBinaryString(i);
			// enqueque binario
			ob.enqueue(bin);
			//muestro info
			System.out.printf("Numero decimal %d binario %s %n", i, bin);
		}
		System.out.println("\n--Numeros binarios en la cola--");
		ob.display();
		
		// deque y muestro
		System.out.println("\n--Sacando binarios de la cola--");
		for (int i = 0; i < numero + 1; i++){

			ob.dequeue();
			// desencolo y muestro la cola
			ob.display();
		}
	}
}