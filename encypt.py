
def encrypt_image():
    fin = input("Enter File Path: ")
    key = int(input("Enter Key: "))
    
    file = open(fin,"rb") #open file in bytes
    
    
    pic = file.read() # get bytes from file
    file.close() 
    
    pic = bytearray(pic) #converts file to byte array
    
    for num, value in enumerate(pic):
        pic[num] = value ^ key # for every byte we are xoring it with the key 
    
    file = open(fin,'wb')
    file.write(pic)

    file.close


    
    

  

    
            

def main():
    encrypt_image()

main()
