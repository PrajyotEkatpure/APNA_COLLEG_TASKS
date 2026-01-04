#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int data;
    struct Node* next;
} Node;

Node* head = NULL;

Node* createNode(int val) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->data = val;
    newNode->next = NULL;
    return newNode;
}

void display() {
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }
    Node* temp = head;
    do {
        printf("%d ", temp->data);
        temp = temp->next;
    } while (temp != head);
    printf("\n");
}

void search(int key) {
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }
    Node* temp = head;
    int pos = 1;
    do {
        if (temp->data == key) {
            printf("Found at position %d\n", pos);
            return;
        }
        temp = temp->next;
        pos++;
    } while (temp != head);
    printf("Not found\n");
}

void insertFirst(int val) {
    Node* newNode = createNode(val);
    if (head == NULL) {
        newNode->next = newNode;
        head = newNode;
        return;
    }
    Node* temp = head;
    while (temp->next != head) temp = temp->next;
    newNode->next = head;
    temp->next = newNode;
    head = newNode;
}

void insertLast(int val) {
    Node* newNode = createNode(val);
    if (head == NULL) {
        newNode->next = newNode;
        head = newNode;
        return;
    }
    Node* temp = head;
    while (temp->next != head) temp = temp->next;
    temp->next = newNode;
    newNode->next = head;
}

void insertAtPosition(int val, int pos) {
    if (pos < 1) {
        printf("Invalid position\n");
        return;
    }
    if (pos == 1) {
        insertFirst(val);
        return;
    }
    Node* newNode = createNode(val);
    Node* temp = head;
    for (int i = 1; i < pos - 1; i++) {
        temp = temp->next;
        if (temp == head) {
            printf("Position out of bounds\n");
            return;
        }
    }
    newNode->next = temp->next;
    temp->next = newNode;
}

void deleteFirst() {
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }
    if (head->next == head) {
        free(head);
        head = NULL;
        return;
    }
    Node* temp = head;
    Node* last = head;
    while (last->next != head) last = last->next;
    head = head->next;
    last->next = head;
    free(temp);
}

void deleteLast() {
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }
    if (head->next == head) {
        free(head);
        head = NULL;
        return;
    }
    Node* temp = head;
    Node* prev = NULL;
    while (temp->next != head) {
        prev = temp;
        temp = temp->next;
    }
    prev->next = head;
    free(temp);
}

void deleteAtPosition(int pos) {
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }
    if (pos == 1) {
        deleteFirst();
        return;
    }
    Node* temp = head;
    Node* prev = NULL;
    for (int i = 1; i < pos; i++) {
        prev = temp;
        temp = temp->next;
        if (temp == head) {
            printf("Position out of bounds\n");
            return;
        }
    }
    prev->next = temp->next;
    free(temp);
}

int main() {
    int choice, val, pos;

    while (1) {
        printf("\n1.Insert First\n2.Insert Last\n3.Insert at Position\n4.Delete First\n5.Delete Last\n6.Delete at Position\n7.Display\n8.Search\n9.Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value: ");
                scanf("%d", &val);
                insertFirst(val);
                break;
            case 2:
                printf("Enter value: ");
                scanf("%d", &val);
                insertLast(val);
                break;
            case 3:
                printf("Enter value and position: ");
                scanf("%d %d", &val, &pos);
                insertAtPosition(val, pos);
                break;
            case 4:
                deleteFirst();
                break;
            case 5:
                deleteLast();
                break;
            case 6:
                printf("Enter position: ");
                scanf("%d", &pos);
                deleteAtPosition(pos);
                break;
            case 7:
                display();
                break;
            case 8:
                printf("Enter value to search: ");
                scanf("%d", &val);
                search(val);
                break;
            case 9:
                return 0;
            default:
                printf("Invalid choice\n");
        }
    }
}
