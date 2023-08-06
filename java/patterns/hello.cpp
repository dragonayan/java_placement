#include <stdio.h>

int set_bit(int n, int off) {
    return n | (1 << off);
}

int clr_bit(int n, int off) {
    return n & ~(1 << off);
}

int toggle_bit(int n, int off) {
    return n ^ (1 << off);
}

int main() {
    int num, off, op;
    int num_test = 0;

    while (num_test < 4) {
        switch (num_test) {
        case 0:
            num = 0;
            off = 0;
            scanf("%02x", &num);
            scanf("%d", &off);
            op = set_bit(num, off);
            printf("%x\n", op);
            break;

        case 1:
            num = 0;
            off = 0;
            scanf("%02x", &num);
            scanf("%d", &off);
            op = clr_bit(num, off);
            printf("%x\n", op);
            break;

        case 2:
        case 3:
            num = 0;
            off = 0;
            scanf("%02x", &num);
            scanf("%d", &off);
            op = toggle_bit(num, off);
            printf("%x\n", op);
            break;
        }

        num_test++;
    }

    return 0;
}
