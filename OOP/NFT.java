// s26016 Melis Toksoy
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nft;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NFT {

    private String hashcode;
    private String name;
    private char category;
    private int price;
    private int[] offers;
    private boolean active;

    //Create constructor
    public NFT(String name, char category, int price) {
        Random r = new Random();
        String rhash = "";
        for (int i = 0; i < 4; i++) {
            char c = (char) (r.nextInt(90) + '!');
            rhash += c;
        }
        this.hashcode = rhash;
        this.name = name;
        this.category = category;
        this.price = price;
        this.active = true;
        this.offers = new int[3];

    }

    public void offer(int offer) {

        for (int i = 0; i < offers.length; i++) {
            if (this.offers[i] == 0) {
                this.offers[i] = offer;
                break;
            }
        }

    }

    public void sell() {
        int highestOffer = this.offers[0];
        for (int i = 1; i < this.offers.length; i++) {
            if (this.offers[i] > highestOffer) {
                highestOffer = this.offers[i];
            }

        }

        System.out.println("En pahalı NFT:" + this.name);

        this.price = highestOffer;
        this.active = false;
       
    }

    public static NFT mostExpensive(NFT[] products) {
        int highestOffer = 0;
        NFT mostExpensive = null;
        for (NFT nft : products) {
            for (int offer : nft.offers) {
                if (offer > highestOffer) {
                    highestOffer = offer;
                    mostExpensive = nft;
                }
            }
        }
        return mostExpensive;
    }

    public String toString() {
        return ("NFT(hashcode = " + hashcode + ",isim = " + name + ",kategori= " + category + ",satis fiyati= " + price + ",aktif= " + active + ")");
    }

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        NFT[] products = {
            new NFT("neverworld", 'I', 15),
            new NFT("darksidemoon", 'L', 250),
            new NFT("jazzrabbit",'G',100),
            new NFT("nooneshouldread",'T',40),
            new NFT("salisbury",'S',1000)
        };
        for (NFT nft : products) {
            System.out.println(nft.name + " adlı ürün icin 3 adet teklif giriniz:");

            for (int i = 0; i < 3; i++) {
                int offer = oku.nextInt();
                System.out.println(nft.name + " " + (i + 1) + ". teklif : " + offer);
                nft.offer(offer);
            }

        }

        for (NFT nft : products) {

            System.out.println(nft);

        }
        NFT mostExpensive = mostExpensive(products);
        if (mostExpensive != null) {
            mostExpensive.sell();
        }

    }

}
