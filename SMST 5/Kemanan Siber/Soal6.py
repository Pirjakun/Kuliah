traffic = "GET /admin"
if "admin" in traffic:
    print("Akses mencurigakan terdeteksi (rule sederhana).")
else:
    print("Traffic aman.")