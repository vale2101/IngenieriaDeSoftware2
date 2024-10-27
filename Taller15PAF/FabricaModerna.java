class FabricaModerna implements FabricaDeMuebles {
    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaModerna();
    }
}
