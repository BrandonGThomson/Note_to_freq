package music_note_freq_calc;
/* calculate musical note freq */
public class note_freq_calc {

	public static void main(String[] args)
	{
	double freq = 0d;
	short basefreq = 432;
	final float A = 1.059463f;
	byte n = 1;
	
	freq = basefreq * (Math.pow(A,n));
			System.out.println("At a base freq of " + basefreq + " C1 = " + freq);
	}
}
