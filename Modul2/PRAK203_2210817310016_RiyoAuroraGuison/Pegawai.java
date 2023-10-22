package PRAK203_2210817310016_RiyoAuroraGuison;
//Pada baris ini terjadi error karena nama kelas harus diubah sesuai nama file yang sebelumnya Employee menjadi Pegawai.
//public class Employee {
	public class Pegawai{ 
 
	public String nama;
//Pada baris ini tipe data char harus diubah menjadi string sehingga pada Main tidak ada error.
//public char asal;
 public String asal; 
 public String jabatan;
//Pada baris ini diinisialisasi variabel yaitu 17
//public int umur;
 public int umur = 17; 

 public String getNama() {
     return nama;
 }

 public String getAsal() { 
     return asal;
 }
//Pada baris ini terjadi error karena tidak ada isi parameter dan belum dideklarasikan.
//public void setJabatan() {    
 public void setJabatan(String j) { 
     this.jabatan = j; 
 }
}