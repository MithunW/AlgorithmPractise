scores = int(input().strip())
minMaxCount= [0, 0]

minScore = scores[0]
maxScore = scores[0]
for score in scores:
    if score < minScore:
        minScore = score
        minMaxCount[1] += 1
    elif score > maxScore:
        maxScore = score
        minMaxCount[0] += 1

print(" ".join(map(str,minMaxCount)))