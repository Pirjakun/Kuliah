logins = ["fail", "fail", "fail", "fail"] 
if logins.count("fail") > 3:
    print("Peringatan: Terlalu banyak login gagal dalam 1 menit!")
else:
    print("Login normal.")
