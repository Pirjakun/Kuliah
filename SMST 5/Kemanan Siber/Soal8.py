traffic_data = ["HTTP", "HTTP", "FTP", "SSH", "HTTP", "FTP"]
for proto in set(traffic_data):
    print(f"{proto}: {traffic_data.count(proto)} kali diakses")