# akademik-client
Sample REST client using Spring Boot

### Daftar Endpoint
- `http://localhost:8081/api/mahasiswa-(GET)`, untuk mendapatkan semua mahasiswa.
- `http://localhost:8081/api/mahasiswaNama-(GET)`, untuk mendapatkan mahasiswa dengan nama tertentu. Contoh: `http://localhost:8081/api/mahasiswaNama?nama=noprianto`
- `http://localhost:8081/api/mahasiswa/{nim}-(GET)`, untuk mendapatkan data mahasiswa nim tertentu. Contoh: `http://localhost:8081/api/mahasiswa/075410099`
- `http://localhost:8081/api/mahasiswa-(POST)`, untuk menambahkan data mahasiswa, requestbody JSON
- `http://localhost:8081/api/mahasiswa-(PUT)`, untuk mengupdate data mahasiswa, requestbody JSON
- `http://localhost:8081/api/mahasiswa-(DELETE)`, untuk menghapus data mahasiswa, requestbody JSON
