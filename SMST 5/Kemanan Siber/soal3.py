ip = "192.168.1.10"
akses_port = [21, 22, 23, 80, 443, 8080]
if len(akses_port) > 5:
    print(f"Peringatan: IP {ip} dicurigai melakukan port scanning!")
else:
    print("Akses port normal.")