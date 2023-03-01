num1 = input("Ingrese numero 1: ")
num1 = int(num1)

num2 = input("Ingrese numero 2: ")
num2 = int(num2)

num3 = input("Ingrese numero 3: ")
num3 = int(num3)


#print (num1,num2,num3)
if num1 > num2 and num1>num3:
    print("El numero mas grande es: ",num1)
elif num2 > num1 and num2 > num3:
    print("El numero mas grande es: ",num2)
elif num3 >num1 and num3 > num2:
    print("El numero mas grande es: ",num3)
else:
    print("Los numeros son iguales")
