#Delete method




    @Override
    public void deleteUserData(Long id) {
         repo.deleteById(id);
    }
