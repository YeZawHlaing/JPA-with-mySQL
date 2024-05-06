# JPA-with-mySQL
#other method



    @Override
    public void deleteUserData(Long id) {
         userRepository.deleteById(id);
    }
