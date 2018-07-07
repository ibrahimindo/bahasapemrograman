import java.util.Scanner;

public class ibrahim_hitungmatriks {
	private static Scanner sc=new Scanner(System.in);
	private static int pilihan, ulang_a, ulang_b, ulang_c, kolom_a, baris_a, kolom_b, baris_b;

	public static void main(String[]args){
		System.out.println("MENGHITUNG MATRIKS");
		System.out.println("Silahkan pilih salah satu!");
		System.out.println("1. Penjumlahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		System.out.print("\n Masukkan nomor yang dipilih : ");
		
		pilihan = sc.nextInt();
		
		switch (pilihan) {
			case 1:
				plus();
				break;
				
			case 2:
				minus();
				break;
				
			case 3:
				x();
				break;
				
			default:
				System.out.println("Pilihan tidak sesuai!");
				break;
		}

	}
	
	private static boolean plusminus_cek(int baris_a, int kolom_a, int baris_b, int kolom_b)
	{
		if((baris_a == baris_b) && (kolom_a == kolom_b))
		{
			return true;
		} 
			else 
		{
			return false;
		}
		
	}
	
	
	private static boolean kali_cek(int kolom_a, int baris_b)
	{
		if(kolom_a == baris_b)
		{
			return true;
		} 
			else 
		{
			return false;
		}
		
	}
	
	
	private static void plus()
	{
		System.out.println("PENJUMLAHAN MATRIKS");
		System.out.println("Ordo Matriks A");
		System.out.print("Jumlah Baris = "); baris_a = sc.nextInt();
		System.out.print("Jumlah Kolom = "); kolom_a = sc.nextInt();
		
		System.out.println("Ordo Matriks B");
		System.out.print("Jumlah Baris = "); baris_b = sc.nextInt();
		System.out.print("Jumlah Kolom = "); kolom_b = sc.nextInt();
		
		System.out.println();
		
		if(plusminus_cek(baris_a, kolom_a, baris_b, kolom_b))
		{
			int matriks_a[][] = new int[baris_a][kolom_a];
			int matriks_b[][] = new int[baris_b][kolom_b];
			int jumlah_hasil[][] = new int[baris_a][kolom_a];
			
			System.out.println("Input Matriks A");
			for(ulang_a = 0; ulang_a < baris_a; ulang_a++)
			{
				for(ulang_b = 0; ulang_b < kolom_a; ulang_b++)
				{
					System.out.print("Matriks A baris ke-"+(ulang_a+1)+" kolom ke-"+(ulang_b+1)+" : ");
					matriks_a[ulang_a][ulang_b] = sc.nextInt();
				}
			}
			
			System.out.println("Input Matriks B");
			for(ulang_a = 0; ulang_a < baris_b; ulang_a++)
			{
				for(ulang_b = 0; ulang_b < kolom_b; ulang_b++)
				{
					System.out.print("Matriks B baris ke- "+(ulang_a+1)+" kolom ke-"+(ulang_b+1)+" : ");
					matriks_b[ulang_a][ulang_b] = sc.nextInt();
				}
			}
			
			System.out.println("Matriks A");
			for(ulang_a = 0; ulang_a < baris_a; ulang_a++)
			{
				for(ulang_b = 0; ulang_b < kolom_a; ulang_b++)
				{
					System.out.print(matriks_a[ulang_a][ulang_b]+" ");
				}
				System.out.println();
			}
			
			System.out.println("Matriks B");
			for(ulang_a = 0; ulang_a < baris_b; ulang_a++)
			{
				for(ulang_b = 0; ulang_b < kolom_b; ulang_b++)
				{
					System.out.print(matriks_b[ulang_a][ulang_b]+" ");
				}
				System.out.println();
			}
			
			System.out.println("Matriks A + Matriks B");
			for(ulang_a = 0; ulang_a < baris_a; ulang_a++)
			{
				for(ulang_b = 0; ulang_b < kolom_a; ulang_b++)
				{
					jumlah_hasil[ulang_a][ulang_b] = matriks_a[ulang_a][ulang_b] + matriks_b[ulang_a][ulang_b];
					System.out.print(jumlah_hasil[ulang_a][ulang_b]+" ");
				}
				System.out.println();
			}
			
		} else 
		{
			System.out.println("Matriks A dan matriks B tidak dapat dijumlahkan");
		}
				
	}
	
	
	private static void minus()
	{
		System.out.println("PENGURANGAN MATRIKS");
		System.out.println("Ordo Matriks A");
		System.out.print("Jumlah Baris = "); baris_a = sc.nextInt();
		System.out.print("Jumlah Kolom = "); kolom_a = sc.nextInt();
		
		System.out.println("Ordo Matriks B");
		System.out.print("Jumlah Baris = "); baris_b = sc.nextInt();
		System.out.print("Jumlah Kolom = "); kolom_b = sc.nextInt();
		
		System.out.println();
		
		if(plusminus_cek(baris_a, kolom_a, baris_b, kolom_b))
		{
			int matriks_a[][] = new int[baris_a][kolom_a];
			int matriks_b[][] = new int[baris_b][kolom_b];
			int hasil_kurang[][] = new int[baris_a][kolom_a];
			
			System.out.println("Input Matriks A");
			for(ulang_a = 0; ulang_a < baris_a; ulang_a++)
			{
				for(ulang_b = 0; ulang_b < kolom_a; ulang_b++)
				{
					System.out.print("Matriks A baris ke-"+(ulang_a+1)+" kolom ke-"+(ulang_b+1)+" : ");
					matriks_a[ulang_a][ulang_b] = sc.nextInt();
				}
			}
			
			System.out.println("Input Matriks B");
			for(ulang_a = 0; ulang_a < baris_b; ulang_a++)
			{
				for(ulang_b = 0; ulang_b < kolom_b; ulang_b++)
				{
					System.out.print("Matriks B baris ke-"+(ulang_a+1)+" kolom ke-"+(ulang_b+1)+" : ");
					matriks_b[ulang_a][ulang_b] = sc.nextInt();
				}
			}
			
			System.out.println("Matriks A");
			for(ulang_a = 0; ulang_a < baris_a; ulang_a++)
			{
				for(ulang_b = 0; ulang_b < kolom_a; ulang_b++)
				{
					System.out.print(matriks_a[ulang_a][ulang_b]+" ");
				}
				System.out.println();
			}
			
			System.out.println("Matriks B");
			for(ulang_a = 0; ulang_a < baris_b; ulang_a++)
			{
				for(ulang_b = 0; ulang_b < kolom_b; ulang_b++)
				{
					System.out.print(matriks_b[ulang_a][ulang_b]+" ");
				}
				System.out.println();
			}
			
			System.out.println("Matriks A - Matriks B");
			for(ulang_a = 0; ulang_a < baris_a; ulang_a++)
			{
				for(ulang_b = 0; ulang_b < kolom_a; ulang_b++)
				{
					hasil_kurang[ulang_a][ulang_b] = matriks_a[ulang_a][ulang_b] - matriks_b[ulang_a][ulang_b];
					System.out.print(hasil_kurang[ulang_a][ulang_b]+" ");
				}
				System.out.println();
			}
			
			
		} else 
		{
			System.out.println("Matriks A dan matriks B tidak dapat dikurangkan");
		}
	}
	
	
	private static void x()
	{
		System.out.println("PERKALIAN MATRIKS");
		System.out.println("Ordo Matriks A");
		System.out.print("Jumlah Baris = "); baris_a = sc.nextInt();
		System.out.print("Jumlah Kolom = "); kolom_a = sc.nextInt();
		
		System.out.println("Ordo Matriks B");
		System.out.print("Jumlah Baris = "); baris_b = sc.nextInt();
		System.out.print("Jumlah Kolom = "); kolom_b = sc.nextInt();
		
		System.out.println();
		
		if(kali_cek(kolom_a, baris_b))
		{
			int matriks_a[][] = new int[baris_a][kolom_a];
			int matriks_b[][] = new int[baris_b][kolom_b];
			int hasil_kali[][] = new int[baris_a][kolom_b];
			
			System.out.println("Input Matriks A");
			for(ulang_a = 0; ulang_a < baris_a; ulang_a++)
			{
				for(ulang_b = 0; ulang_b < kolom_a; ulang_b++)
				{
					System.out.print("Matriks A baris ke-"+(ulang_a+1)+" kolom ke-"+(ulang_b+1)+" : ");
					matriks_a[ulang_a][ulang_b] = sc.nextInt();
				}
			}
			
			System.out.println("Input Matriks B");
			for(ulang_a = 0; ulang_a < baris_b; ulang_a++)
			{
				for(ulang_b = 0; ulang_b < kolom_b; ulang_b++)
				{
					System.out.print("Matriks B baris ke-"+(ulang_a+1)+" kolom ke-"+(ulang_b+1)+" : ");
					matriks_b[ulang_a][ulang_b] = sc.nextInt();
				}
			}
			
			System.out.println("Matriks A");
			for(ulang_a = 0; ulang_a < baris_a; ulang_a++)
			{
				for(ulang_b = 0; ulang_b < kolom_a; ulang_b++)
				{
					System.out.print(matriks_a[ulang_a][ulang_b]+" ");
				}
				System.out.println();
			}
			
			System.out.println("Matriks B");
			for(ulang_a = 0; ulang_a < baris_b; ulang_a++)
			{
				for(ulang_b = 0; ulang_b < kolom_b; ulang_b++)
				{
					System.out.print(matriks_b[ulang_a][ulang_b]+" ");
				}
				System.out.println();
			}

			System.out.println("Matriks A . Matriks B");
			for(ulang_a = 0; ulang_a < baris_a; ulang_a++)
			{
				for(ulang_b = 0; ulang_b < kolom_b; ulang_b++)
				{
					for(ulang_c = 0; ulang_c < baris_b; ulang_c++)
					{
						hasil_kali[ulang_a][ulang_b] += matriks_a[ulang_a][ulang_c] * matriks_b[ulang_c][ulang_b];
					}
					System.out.print(hasil_kali[ulang_a][ulang_b]+" ");
				}
				System.out.println();
			}
			
		} else 
		{
			System.out.println("Matriks A dan matriks B tidak dapat dikalikan");
		}
	}

}