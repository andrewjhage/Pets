all: class1.hpp class1.cpp class2.hpp class2.cpp main.cpp
    g++ -c class1.cpp
    g++ -c class2.cpp
    g++ -c main.cpp
    g++ class1.o class2.o main.o -o exec

run: all
    ./exec

clean:
    rm -f *.o
    rm -f exec

valgrind:
    valgrind --leak-check=yes ./exec

jar: all
    jar cfm Pet.jar manifest.txt *.class
    java -jar Pet.jar