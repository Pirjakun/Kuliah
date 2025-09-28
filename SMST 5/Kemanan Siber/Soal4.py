import hashlib

data = b"isi_file_aman"
hash_asli = hashlib.sha256(data).hexdigest()
hash_cek = hashlib.sha256(data).hexdigest()

if hash_asli == hash_cek:
    print("File aman, hash sesuai.")
else:
    print("File rusak atau dimodifikasi!")