# JPA-with-mySQL
#other method
@Override
    public UserEntity saveUserData(UserEntity userEntity) {
     return userRepository.save(userEntity);
    }
 @Override
    public UserEntity updateUserData(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public void deleteUserData(Long id) {
         userRepository.deleteById(id);
    }
