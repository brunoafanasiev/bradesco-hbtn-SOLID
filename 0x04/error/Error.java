public class Error {

    // Usa exceções ao invés de retornar códigos ou null
    public User createUser(User user) {
        try {
            loadUser(user.getId());
            throw new UserExistsException(user.getId());
        } catch (UserNotFoundException exception) {
            // detail here
        }

        resolveGroup(user);
        return userRepository.save(user);
    }

    // Exceção com contexto claro
    public void validate(String id) {
        if (ownerRepo.count(id) == 0) {
            throw new ValidationException("id: " + id + " não foi informado, deveria ser informado...")
        }
    }

    // Não retorne null e não passe null
    public User createUser(User user) {

        try {
            loadUser(user.getId());
            throw new UserExistsException(user.getId())
        } catch (UserNotFoundException exception) {
            // detail here
        }

        resolveGroup(user);
        return userRepository.save(user);
    }

}
