time = input()
hh, mm, ss = map(int, time[:-2].split(':'))
if time[-2:] == 'PM' and hh != 12:
    hh += 12
elif time[-2:] == 'AM' and hh == 12:
    hh = 0
print(f"{hh:02}:{mm:02}:{ss:02}")