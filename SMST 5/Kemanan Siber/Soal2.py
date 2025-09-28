password = "Cyber123"
if any(c.isupper() for c in password) and any(c.isdigit() for c in password):
    print("Password valid.")
else:
    print("Password tidak valid.")