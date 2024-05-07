package com.market.cart;

import com.market.bookitem.Book;

public class CartItem {
    // 변수
    // private String[] itemBook = new String[7];
    private Book itemBook;
    private String bookID;
    private int quantity;
    private int totalPrice;

    // 생성자
    public CartItem() {
    }

    /*
     * public CartItem(String[] book) {
     * this.itemBook = book;
     * this.bookID = book[0];
     * this.quantity = 1;
     * updateTotalPrice();
     * }
     */
    public CartItem(Book booklist) { // 9장
        this.itemBook = booklist;
        this.bookID = booklist.getBookId();
        this.quantity = 1;
        updateTotalPrice();
    }

    // Getter 메서드
    // public String[] getItemBook() { return itemBook; }
    public Book getItemBook() {
        return itemBook;
    } // 9장

    public String getBookID() {
        return bookID;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    // Setter 메서드
    // public void setItemBook(String[] itemBook) { this.itemBook = itemBook; }
    public void setItemBook(Book itemBook) {
        this.itemBook = itemBook;
    } // 9장

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    } // 9장

    public void updateTotalPrice() {
        // totalPrice = Integer.parseInt(this.itemBook[2]) * this.quantity; //
        // Integer.parseInt = 문자열을 숫자로 변경하는 메서드
        totalPrice = this.itemBook.getUnitPrice() * this.quantity; // 9장
    }

    public static boolean isCartInBook(String bookId) {
        boolean flag = false;
        for (int i = 0; i < mCartCount; i++) {
            if (bookId == mCartItem[i].getBookID()) {
                mCartItem[i].setQuantity(mCartItem[i].getQuantity() + 1);
                flag = true;
            }
        }
        return flag;
    }

}
