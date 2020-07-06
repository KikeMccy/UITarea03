package com.example.uitarea03.io;

public class Listado {
    private Boolean status;
    private Usuario[] objects;

    public Listado(Boolean status, Usuario[] objects) {
        this.status = status;
        this.objects = objects;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Usuario[] getObjects() {
        return objects;
    }

    public void setObjects(Usuario[] objects) {
        this.objects = objects;
    }

    public class Usuario{
        private int id;
        private  String first_name;
        private  String last_name;
        private  String avatar;
        private  String created_at;
        private  String updated_at;

        public Usuario(int id, String first_name, String last_name, String avatar, String created_at, String updated_at) {
            this.id = id;
            this.first_name = first_name;
            this.last_name = last_name;
            this.avatar = avatar;
            this.created_at = created_at;
            this.updated_at = updated_at;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }
    }

}
