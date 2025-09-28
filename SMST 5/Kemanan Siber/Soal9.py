hash_file = "a1b2c3d4e5"
hash_malware = ["x9y8z7", "a1b2c3d4e5", "m3m4m5"]

if hash_file in hash_malware:
    print("Peringatan: File terdeteksi sebagai malware!")
else:
    print("File aman.")