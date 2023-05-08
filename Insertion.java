public class Insertion{

	int[] A;

	public Insertion(int[] m){
		this.A = m;
	}

	public void insertion() {

		int key,i ;
		for(int j=1; j<this.A.length; j=j+1){
			key = this.A[j];
			i = (j-1);
			while (i>-1 && this.A[i]>key) {
				this.A[i+1] = this.A[i];
				i = (i-1);
			}
			this.A[i+1] = key;
		}
	
	}
}
