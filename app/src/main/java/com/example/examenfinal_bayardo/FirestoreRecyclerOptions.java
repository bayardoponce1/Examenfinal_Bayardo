package com.example.examenfinal_bayardo;

import androidx.annotation.Nullable;

import com.google.firebase.firestore.Query;

import java.security.cert.CertPathBuilder;

public class FirestoreRecyclerOptions<T> {
    public static class Builder<T> {
        public CertPathBuilder equals(Query baseQuery, Class<Person> personClass) {
            return getCertPathBuilder();
        }

        @Nullable
        private static CertPathBuilder getCertPathBuilder() {
            return null;
        }
    }
}
