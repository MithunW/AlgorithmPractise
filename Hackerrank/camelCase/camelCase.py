import re
import sys

def split(name):
    words=re.findall(r'[A-Z][a-z]*|[a-z]+', name)
    stringSet = " ".join(map(str.lower,words))
    return stringSet
    
def camelCase(name):
    words = name.strip().split()
    if not words:
        return ""
    words[0] = words[0].lower()
    for i in range(1, len(words)):
        words[i] = words[i].capitalize()
    return "".join(words)

    
def classOperations(operation,name):
    if (operation == "S"):
        return split(name)
    else:
        return (camelCase(name))[0].capitalize()+camelCase(name)[1:]

def methodOperations(operation,name):
    if (operation == 'S'):
        return split(name[:-2])
    else:
        return camelCase(name)+"()"
        
def variableOperations(operation,name):
    if (operation == "S"):
        return split(name)
    else:
        return camelCase(name)

for line in sys.stdin:
    if line.strip():
        inputArr = line.strip().split(";")
        ops,typ,name = inputArr[0], inputArr[1], inputArr[2]
        if typ == "C":
            print(classOperations(ops,name))
        elif typ == "M":
            print(methodOperations(ops,name))
        else:
            print(variableOperations(ops,name))