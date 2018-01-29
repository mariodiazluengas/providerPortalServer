import com.mysecurerest

package com.sineti.provider-portal

class Provider {

    User user

    static constraints = {
        user unique: true, nullable: true
    }
}
