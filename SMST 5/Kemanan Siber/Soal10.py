files = {"config.txt": "abc123", "data.txt": "def456"}
cek_files = {"config.txt": "abc123", "data.txt": "xyz789"} 

for f in files:
    if files[f] != cek_files[f]:
        print(f"File {f} telah dimodifikasi!")