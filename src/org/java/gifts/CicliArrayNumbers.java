package org.java.gifts;

	public class CicliArrayNumbers {
																	
	private int[] numbers;
	int memoriaFunzione = 0;
	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	public CicliArrayNumbers(int [] arrayInteri) {
		this.setNumbers(arrayInteri);
	}
	
	public int getElementoSuccessivo() {
		int x = this.numbers[memoriaFunzione];
		memoriaFunzione++;
		return x;
		
	}
	
	public boolean hasAncoraElementi() {
		
		return (memoriaFunzione == this.numbers.length) ? false : true;
		}
	}
	
	
	
	
		
		
		
//		int longness = numbers.length;
//		
//		for(int x= 0 ; x<longness ; x++) {
//			int randomNum = random.nextInt(9);
//			numbers[x] = randomNum;
//		}
//		
//		System.out.println(numbers);
		
//		while(numbers.hasNext()) {
//			int current = numbers.next();
//		}
	
	
}
	