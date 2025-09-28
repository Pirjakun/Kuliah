import numpy as np

data = [10, 12, 11, 13, 200]
mean = np.mean(data)
std = np.std(data)
z_scores = [(x - mean) / std for x in data]

for i, z in enumerate(z_scores):
    if abs(z) > 2:
        print(f"Anomali terdeteksi pada data {data[i]}")